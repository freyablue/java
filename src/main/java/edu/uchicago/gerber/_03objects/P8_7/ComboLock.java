package edu.uchicago.gerber._03objects.P8_7;

public class ComboLock {
    public int secret1;
    public int secret2;
    public int secret3;
    public int current;
    public int state;
    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.current = 0;
        this.state = 0;
        // 0 initial, 1: right secret1, 2: left secret2, 3:right secret3
    }
    public void reset() {
        this.current = 0;
        this.state = 0;

    }
    public void turnLeft(int ticks) {
        this.current-=ticks;
        if(this.current<0){ this.current+=39;}
        if (this.current==this.secret2 && this.state==1){this.state+=1;}

    }
    public void turnRight(int ticks) {
        current+=ticks;
        if (current>39){current-=39;}
        if(this.current==this.secret1 && this.state==0){this.state+=1;}
        else if (this.current==this.secret3 && this.state==2){this.state+=1;}
    }
    public boolean open() {
        if(this.state==3) {
            return true;}
        return false; }
}
