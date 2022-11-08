package edu.uchicago.gerber._06design.P12_1;
import java.util.*;
public class VendingMachineRead {
    Scanner s = new Scanner(System.in);
    public VendingMachineRead() {
    }
    public void showP(ArrayList<Product> products) {
        char i='A';
        for(Product p : products) {
            System.out.println(i+") "+ p.pname + " " +p.price+" "+p.quantity);
            i+=1;
        }
    }

    public Coin getCoin() {
        System.out.println("A) dollar");
        System.out.println("B) quarter");
        System.out.println("C) dime");
        System.out.println("D) nickel");
        System.out.println("E) penny");

        char choice = s.next().charAt(0);

        switch (choice) {
            case 'E':
                return new Coin("penny",0.01);
            case 'D':
                return new Coin("nickel",0.05);
            case 'C':
                return new Coin("dime",0.1);
            case 'B':
                return new Coin("quarter",0.25);
            case 'A':
                return new Coin("dollar",1.0);
            default:
                return null;
        }
    }

    public Product getProduct() {
        System.out.println("Product Name: ");
        String name = s.next();
        System.out.println("Price: ");
        double price = s.nextDouble();
        System.out.println("Stock: ");
        int quantity = s.nextInt();
        return new Product(name,price,quantity);
    }

    void buy(VendingMachine vm, char choice) {
        int inde = 0;
        int ascii = (int) choice;
        if(ascii>=65 && ascii<=90) {
            inde = ascii - 65;
        }else {
            System.out.println("This is an invalid try");
            return;
        }
        Product product = vm.products.get(inde);
        if(product.quantity>=1) {
            if(vm.sufficientAmount(product)) {
                product.quantity-=1;
                vm.get_rest(product.price);
                if(product.quantity==0) {
                    vm.products.remove(product);
                }
                System.out.println("Purchased: "+product.pname);
            }else {
                System.out.println("Insufficient Money");
            }
        }else {
            System.out.println("Insufficient stock for product "+product.pname);
        }

    }

    public void run(VendingMachine vm) {
        char choice;
        do {
            System.out.println("Instructions:");
            System.out.println("S)Show product I)Insert money(coins) B)Buy product A)Add stock R)Remove money(coins) Q)Quit");
            choice = s.next().charAt(0);

            switch (choice) {
                case ('S'):
                    if (vm.products.size() > 0) {
                        showP(vm.products);
                    } else {
                        System.out.println("No product in vending machine");
                    }
                    break;

                case 'I':
                    vm.insertMoney(getCoin());
                    break;

                case 'B':
                    if (vm.products.size() > 0) {
                        showP(vm.products);
                        char c = s.next().charAt(0);
                        buy(vm, c);
                    } else {
                        System.out.println("No product in vending machine");
                    }
                    break;
                case 'A':
                    vm.products.add(getProduct());
                    break;

                case 'R':
                    double amount = vm.calculateTotal();
                    vm.removeAll();
                    System.out.println("Removed amount: " + amount);
                    break;

                case 'Q':
                    System.exit(0);
                    break;

                default:
                    break;
            }

        }while(choice!='Q');
    }




}

