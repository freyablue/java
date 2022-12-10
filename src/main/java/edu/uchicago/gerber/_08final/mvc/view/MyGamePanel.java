package edu.uchicago.gerber._08final.mvc.view;
import edu.uchicago.gerber._08final.mvc.controller.Game;
import edu.uchicago.gerber._08final.mvc.model.CommandCenter;
import edu.uchicago.gerber._08final.mvc.model.Falcon;
import edu.uchicago.gerber._08final.mvc.model.Movable;
import edu.uchicago.gerber._08final.mvc.model.FlyObject;
import edu.uchicago.gerber._08final.mvc.model.EnemyPlane;
import edu.uchicago.gerber._08final.mvc.model.MyBullet;
import edu.uchicago.gerber._08final.mvc.model.Plane;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.*;
import java.util.Timer;
import javax.swing.*;
import javax.imageio.*;
import javax.sound.sampled.Clip;

public class MyGamePanel extends JPanel{
	private Graphics grpOff;
    public static BufferedImage background,myplane,splane,mplane,lplane,bullet;

	public static final int WIDTH = 400; 
    public static final int HEIGHT = 700; 
   
	private GameFrame gmf;
	private Font fntBig = new Font("SansSerif", Font.BOLD + Font.ITALIC, 36);
	private FontMetrics fmt; 
	private int fontWidth;
	private int fontHeight;
	private Clip clpMusicBackground;
	private int state;
    private int score;
    private Timer timer;
	private FlyObject[] Enemys = {}; 
    private MyBullet[] bullets = {}; 
    private Plane plane;
	private int itv = 10;
	private int bIndex = 0; 
	private int enemyIndex = 0; 

	
    private static final int S = 0; //start
    private static final int R = 1; //run
    private static final int P = 2; //pause
    private static final int O = 3; //game over
	
	// ==============================================================
	// CONSTRUCTOR 
	// ==============================================================
	
	public MyGamePanel(int width, int height){
		plane = new Plane();
		state = S;
	    gmf = new GameFrame();
		gmf.getContentPane().add(this);
		gmf.pack();
		initView();
		gmf.setSize(width,height);
        gmf.setAlwaysOnTop(true);
        gmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gmf.setTitle("Airplane Shooting Game");
		gmf.setResizable(false);
        gmf.setLocationRelativeTo(null);
		gmf.setVisible(true);
		setFocusable(true);
		//clpMusicBackground = Sound.clipForLoopFactory("music-background.wav");
	}

   
    static { 
        try {
            background = ImageIO.read(MyGamePanel.class.getResource("Resource/background.jpg"));
			myplane = ImageIO.read(MyGamePanel.class.getResource("Resource/plane.png"));
			splane = ImageIO.read(MyGamePanel.class.getResource("Resource/senemy.png"));
			lplane = ImageIO.read(MyGamePanel.class.getResource("Resource/enemy.png"));
			bullet =  ImageIO.read(MyGamePanel.class.getResource("Resource/bullet.png"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
        MyGamePanel game = new MyGamePanel(WIDTH, HEIGHT); 
        game.execute(); //execute
    }
	
	// ==============================================================
	// METHODS 
	// ==============================================================
	@Override
    public void paint(Graphics g) {
		super.paint(g);
        g.drawImage(background, 0, 0,null);
        g.drawImage(plane.getImage(), plane.getX(),plane.getY(), null);
		for (MyBullet b:bullets) {
            g.drawImage(b.getImage(), b.getX() - b.getWidth() / 2, b.getY(),
                    null);
        }
		for (FlyObject f:Enemys) {
            g.drawImage(f.getImage(), f.getX(), f.getY(), null);
        }
		drawScoreLife(g);
		showState(g);
		// displayTextOnScreen();
        
    }

	public void showState(Graphics g){
		g.setColor(Color.YELLOW);
        Font font = new Font("SansSerif", Font.BOLD, 20);
		g.setFont(font);
		if(state ==0){
			g.drawString("Start ",fontWidth+WIDTH/3, fontHeight+HEIGHT/2);		 			
		}
		if(state==2){
			g.drawString("Pause ",fontWidth+WIDTH/3, fontHeight+HEIGHT/2);
		}
		if(state==3){
			g.drawString("Game Over ",fontWidth+WIDTH/3, fontHeight+HEIGHT/2);
		}
		
	}


	private void drawScoreLife(Graphics g) {
		g.setColor(Color.white);
        Font font = new Font("SansSerif", Font.BOLD, 13);
		g.setFont(font);
		g.drawString("SCORE :  " + score,fontWidth, fontHeight);
		g.drawString("Life: "+plane.getLife(), fontWidth, fontHeight+20);
		
	}
	public void initialize(){
		plane = new Plane() ;
		bullets = new MyBullet[0]; // remove all
        Enemys = new FlyObject[0]; //remove all                    
        score = 0; 
        state = S; 

	}

	public void execute(){
		MouseAdapter l = new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if (state == R) { 
                    plane.move(e.getX(),e.getY());
                }
            }
           
            @Override
            public void mouseExited(MouseEvent e) { 
                if (state !=S && state!=O) { 
                    state = P;
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {     
                if(state==S||state ==P){
					state = R; 
				}               
                if(state==O){
					initialize();        
                }
            }
        };
        this.addMouseListener(l); // mouse click
        this.addMouseMotionListener(l); // mouse slide

        timer = new Timer(); 
		TimerTask tk = new TimerTask() {
			@Override
            public void run() {
                if (state == R) { 
                    enterNew(); 
                    move(); 
                    shootAction();
                    hitCollision();
                    outOfBounds(); 
                    checkGameOverAction(); 
                }
                repaint(); 
            }		
		};
		timer.schedule(tk, itv,itv);
    }

	//add new enemy
    public void enterNew() {
        enemyIndex+=1;
        if (enemyIndex % 40 == 0) { 
            FlyObject obj = new EnemyPlane(); 
            Enemys = Arrays.copyOf(Enemys, Enemys.length + 1);
            Enemys[Enemys.length - 1] = obj;
        }
    }

    public void move() {
		plane.step(); 
        for (FlyObject f:Enemys) { 
            f.step();
        }
        for (MyBullet b:bullets) { 
            b.step();
        }    
    }

    

    public void shootAction() {
        bIndex+=1;
        if (bIndex % 40 == 0) { 
            MyBullet[] bs = plane.shoot(); 
			List bs_list = Arrays.asList(bs);
			//add new generated bullets to the array
            bullets = Arrays.copyOf(bullets, bullets.length + bs.length); 
            System.arraycopy(bs, 0, bullets, bullets.length - bs.length,
                    bs.length); 
        }
    }

    
    public void hitCollision() {
        for (MyBullet b:bullets) { 
            hit(b); 
        }
    }

   
    public void outOfBounds() {
		int index = 0; 
        MyBullet[] newbullets= new MyBullet[bullets.length];
        for (MyBullet b:bullets) {
            if (!b.checkBounds()) {
                newbullets[index++] = b;
            }
        }
        bullets = Arrays.copyOf(newbullets, index); 

        index = 0; 
        FlyObject[] newenemys = new FlyObject[Enemys.length]; 
        for (FlyObject f:Enemys) {
            if (!f.checkBounds()) {
                newenemys[index++] = f; 
            }
        }
        Enemys = Arrays.copyOf(newenemys, index); 

    }

    public void checkGameOverAction() {
		for (int i = 0; i < Enemys.length; i++) {
            int index = -1;
			FlyObject obj = Enemys[i];
            if (plane.Collision(obj)) { 
                plane.reduceLife();
                plane.setFire(0);
                index = i; 
            }
            if (index != -1) {
                FlyObject t = Enemys[index];
                Enemys[index] = Enemys[Enemys.length - 1];
                Enemys[Enemys.length - 1] = t; 

                Enemys = Arrays.copyOf(Enemys, Enemys.length - 1); 
            }
        }
		Boolean b = plane.getLife() <= 0;
		if(b){
			state = 3;
		}

    }

    
    public void hit(MyBullet bullet) {
        int index = -1; 
        for (int i = 0; i < Enemys.length; i++) {
            FlyObject obj = Enemys[i];
            if (obj.shootHit(bullet)) { 
                index = i; 
				score+=1;
                break;
            }
        }
        if (index>=0) { 
            FlyObject curr = Enemys[index]; 
            Enemys[index] = Enemys[Enemys.length - 1];
            Enemys[Enemys.length - 1] = curr;

            Enemys = Arrays.copyOf(Enemys, Enemys.length - 1); 

        }
    }
	
	private void initView() {
		Graphics g = getGraphics();			// get the graphics context for the panel
        Font fnt = new Font("SansSerif", Font.BOLD, 13);
		g.setFont(fnt);						// take care of some simple font stuff
		fmt = g.getFontMetrics();
		fontWidth = fmt.getMaxAdvance();
		fontHeight = fmt.getHeight();
		g.setFont(fntBig);					// set font info
	}
	
	// // This method draws some text to the middle of the screen before/after a game
	private void displayTextOnScreen() {
		grpOff.drawString("Click to start: ", WIDTH/2, HEIGHT/2);

	}
	
}
