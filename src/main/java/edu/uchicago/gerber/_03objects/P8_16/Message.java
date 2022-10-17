package edu.uchicago.gerber._03objects.P8_16;

public class Message {
    private String sender;
    private String recipient;
    private String message_body = "";
    public Message(String sender, String recipient){
        this.sender = sender;
        this.recipient = recipient;
    }
    public void append(String t){
        this.message_body += t;
    }
    public String toString(){
        return "From: "+this.sender  +"\nTo "+ this.recipient+ "\n"+ this.message_body +"\n";
    }
}
