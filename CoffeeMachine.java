import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String action;
        String order;
        boolean stopProgram = false;
        Coffee coffee = new Coffee();


        while (!stopProgram) {

            // Gets user action
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    order = sc.next();
                    switch (order) {
                        case "1":
                            coffee.espresso();
                            break;
                        case "2":
                            coffee.latte();
                            break;
                        case "3":
                            coffee.cappuccino();
                            break;
                        default:
                            break;
                    }
                    break;

                case "fill":
                    coffee.fill(sc);
                    break;
                case "take":
                    coffee.take();
                    break;
                case "remaining":
                    // prints out stats for machine
                    coffee.remaining();
                    break;
                case "exit":
                    stopProgram = true;
                    break;
                default:
                    break;
            }
        }
    }
}
