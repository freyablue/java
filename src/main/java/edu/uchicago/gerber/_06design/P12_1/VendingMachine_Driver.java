package edu.uchicago.gerber._06design.P12_1;

public class VendingMachine_Driver {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        VendingMachineRead r = new VendingMachineRead();
        r.run(vm);


    }
}
