package edu.uchicago.gerber._03objects.P8_8;

public class VotingMachine_Dirver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.reset();
        vm.voteDemocrat();
        vm.voteDemocrat();
        vm.voteRepublican();
        vm.voteRepublican();
        vm.voteRepublican();
        vm.voteRepublican();
        System.out.println("tallies for Republican: "+vm.getRepublican());
        System.out.println("tallies for Democrat: "+vm.getDemocrat());

    }
}
