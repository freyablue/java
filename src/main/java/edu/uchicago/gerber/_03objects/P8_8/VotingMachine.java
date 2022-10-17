package edu.uchicago.gerber._03objects.P8_8;

public class VotingMachine {
    private int countDemocrat;
    private int countRepublican;
    public VotingMachine(){
        this.reset();
    }
    public int getRepublican(){
        return countRepublican;
    }
    public int getDemocrat(){
        return countDemocrat;
    }
    public void voteRepublican(){
        this.countRepublican+=1;
    }
    public void voteDemocrat(){
        this.countDemocrat+=1;
    }
    public void reset(){
        this.countDemocrat = 0;
        this.countRepublican = 0;
    }
}
