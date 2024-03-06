package project;
import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {

        int hasWater = 400;
        int hasMilk = 540;
        int hasCoffeeBeans = 120;
        int hasDisposableCups = 9;
        int hasMoney = 550;
        boolean b = true;

        while (b) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.next();


            switch (action) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String action2 = scanner.next();
                    switch (action2) {
                        case "1" -> {
                            if (hasWater > 250 && hasCoffeeBeans > 16 && hasDisposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                hasWater -= 250;
                                hasCoffeeBeans -= 16;
                                hasDisposableCups--;
                                hasMoney += 4;
                            } else System.out.println("Sorry, not enough water!");

                        }
                        case "2" -> {
                            if (hasWater > 350 && hasMilk > 75 && hasCoffeeBeans > 20 && hasDisposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");

                                hasWater -= 350;
                                hasMilk -= 75;
                                hasCoffeeBeans -= 20;
                                hasDisposableCups--;
                                hasMoney += 7;
                            } else System.out.println("Sorry, not enough water!");
                        }
                        case "3" -> {
                            if (hasWater > 200 && hasMilk > 100 && hasCoffeeBeans > 12 && hasDisposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                hasWater -= 200;
                                hasMilk -= 100;
                                hasCoffeeBeans -= 12;
                                hasDisposableCups--;
                                hasMoney += 6;
                            } else System.out.println("Sorry, not enough water!");
                        }
                        case "back" -> {
                            continue;
                        }
                    }


                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add:");
                    int addWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int addMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int addCoffee = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:  ");
                    int addCups = scanner.nextInt();
                    hasWater += addWater;
                    hasMilk += addMilk;
                    hasCoffeeBeans += addCoffee;
                    hasDisposableCups += addCups;

                }
                case "take" -> {
                    System.out.println("I gave you " + hasMoney);
                    hasMoney = 0;

                }
                case "remaining" -> System.out.println("The coffee machine has: \n" +
                        hasWater + " ml of water \n" +
                        hasMilk + " ml of milk \n" +
                        hasCoffeeBeans + " g of coffee beans \n" +
                        hasDisposableCups + " disposable cups \n" +
                        "$" + hasMoney + " of money");

                case "exit" -> b = false;
            }
        }
    }
}




