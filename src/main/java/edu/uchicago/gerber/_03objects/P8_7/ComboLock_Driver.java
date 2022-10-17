package edu.uchicago.gerber._03objects.P8_7;

public class ComboLock_Driver {
    public static void main(String[] args) {
        ComboLock CurrentLock = new ComboLock(10, 25, 30);
        CurrentLock.reset();
        CurrentLock.turnRight(10);
        CurrentLock.turnLeft(18);
        CurrentLock.turnRight(9);
        System.out.println("the first try: " + CurrentLock.open()); //try a false one
        CurrentLock.reset();
        CurrentLock.turnRight(10);
        CurrentLock.turnLeft(24);
        CurrentLock.turnRight(5);
        System.out.println("the second try: " + CurrentLock.open()); // try a right one
    }

}
