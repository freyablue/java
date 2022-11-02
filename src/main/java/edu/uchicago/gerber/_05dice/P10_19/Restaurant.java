package edu.uchicago.gerber._05dice.P10_19;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restaurant extends JFrame implements ActionListener {
    private JTextField itemMenu;
    private JTextField itemPrice;
    private JLabel bills;
    private JLabel food, price,tip,totalPrice,estip,tax,estax,b,estb;
    private JButton[] items;
    private JButton billAmount;
    private double cost;
//    private ChartComponent chart;
    public Restaurant(){
        initial();

    }

    public void initial(){
        cost = 0;
        items = new JButton[10];
        items[0] = new JButton("Pancake 4.00");
        items[1] = new JButton("Taco 3.00");
        items[2] = new JButton("Burger 15.00");
        items[3] = new JButton("Kebab 10.00");
        items[4] = new JButton("BeefCurry 12.00");
        items[5] = new JButton("Dumplings 14.00");
        items[6] = new JButton("FriedChicken 11.00");
        items[7] = new JButton("HotDog 6.00");
        items[8] = new JButton("Juice 3.50");
        items[9] = new JButton("OrangeChicken 12.00");
        setLayout(new GridLayout(12, 2));

        for(JButton item:items){
            item.addActionListener(this);
            add(item);
        }
        food = new JLabel("Extra order");
        add(food);
        price = new JLabel("Price");
        add(price);
        itemMenu = new JTextField();
        add(itemMenu);
        itemPrice = new JTextField();
        add(itemPrice);
        totalPrice = new JLabel("Total cost: ");
        add(totalPrice);
        bills  = new JLabel();
        add(bills);
        tip= new JLabel("Recommended tip: ");
        add(tip);
        estip = new JLabel();
        add(estip);
        tax = new JLabel("Tax: ");
        add(tax);
        estax = new JLabel();
        add(estax);

        b = new JLabel("Bill: ");
        add(b);
        estb = new JLabel();
        add(estb);




        billAmount = new JButton("calculate");
        add(billAmount);
        billAmount.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "calculate":
                String t = itemPrice.getText();
                if(t.length()>0){
                    double addition_cost = Double.parseDouble(t);
                    cost+=addition_cost;
                }
                estip.setText(""+cost*0.15);
                bills.setText(""+cost);
                estax.setText(""+cost*0.1);
                estb.setText(""+cost*1.25);
                break;
            case "Pancake 4.00":
                cost+=4;
                break;
            case "Taco 3.00":
                cost+=3;
                break;
            case "Burger 15.00":
                cost+=15;
                break;
            case "Kebab 10.00":
                cost+=10;
                break;
            case "BeefCurry 12.00":
                cost+=12;
                break;
            case "Dumplings 14.00":
                cost+=14;
                break;
            case "FriedChicken 11.00":
                cost+=11;
                break;
            case "HotDog 6.00":
                cost+=6;
                break;
            case "Juice 3.50":
                cost+=3.5;
                break;
            case "OrangeChicken 12.00":
                cost+=12;
                break;


        }

    }

}
