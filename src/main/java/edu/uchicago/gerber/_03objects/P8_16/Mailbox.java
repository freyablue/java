package edu.uchicago.gerber._03objects.P8_16;

import java.util.ArrayList;

public class Mailbox {
    ArrayList<Message> msg = new ArrayList();
    public Mailbox(){}
    public void addMessage(Message m){
        msg.add(m);
    }
    public Message getMessage(int i){
        return msg.get(i);
    }
    public void removeMessage(int i){
        msg.remove(i);
    }
}
