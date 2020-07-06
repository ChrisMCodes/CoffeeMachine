// this is the Coffee class that the CoffeeMachine driver runs on

import java.util.Scanner;

class Coffee {
        private int water = 400;
        private int milk = 540;
        private int beans = 120;
        private int cups = 9;
        private int money = 550;
    
    // constructor
    public void Coffee() {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }
    
    /**
     *
     * callable methods to make coffee
     *
     */
    public void espresso() {
        if (this.water - 250 >= 0 && beans - 16 >= 0 && cups - 1 >= 0) {
            this.water -= 250;
            this.beans -= 16;
            this.money += 4;
            this.cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water - 250 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if (beans - 16 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups - 1 < 0) {
            System.out.println("Sorry, not enough coffee cups!");
        }
    }
    
    public void latte() {
        if (this.water - 350 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk - 75 < 0) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans - 20 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups - 1 < 0) {
            System.out.println("Sorry, not enough coffee cups!");
        } else {
            this.water -= 350;
            this.milk -= 75;
            this.beans -= 20;
            this.money += 7;
            this.cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void cappuccino() {
        if (this.water - 200 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk - 100 < 0) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans - 12 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups - 1 < 0) {
            System.out.println("Sorry, not enough coffee cups");
        } else {
            this.water -= 200;
            this.milk -= 100;
            this.beans -=12;
            this.money += 6;
            this.cups -= 1;
        } 
    }
    
    /**
     *
     * now some other methods to manipulate the machine
     *
     */
    public void fill(Scanner sc) {
        System.out.println("Write how many ml of water do you want to add:");
        this.water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += sc.nextInt();
    }
    
    public void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }
    
    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of beans");
        System.out.println(this.cups + " of cups");
        System.out.println("$" + this.money + " of money");
    }
    
    
    
}

