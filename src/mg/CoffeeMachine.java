package mg;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
	// write your code here
        CoffeeAdvance coffeeAdvance = new CoffeeAdvance();
        coffeeAdvance.status();
        coffeeAdvance.action();
    }
}

class Coffee {
    Scanner scanner = new Scanner(System.in);
    int cups = 0;
    int waterAmount = 0;
    int milkAmount = 0;
    int coffeebeansAmount = 0;
    int cupsAmount = 0;

    void greetings() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

    void machnieStart() {
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();
    }

    void ingrediens() {
        int water = cups * 200;
        int milk = cups * 50;
        int coffeebeans = cups * 15;

        System.out.printf("For %d cups of coffee you will need:", cups);
        System.out.println();
        System.out.printf("%d ml of water", water);
        System.out.println();
        System.out.printf("%d ml of milk", milk);
        System.out.println();
        System.out.printf("%d g of coffee beans", coffeebeans);
        System.out.println();
    }

    void servingsNeed() {
        System.out.println("Write how many ml of water the coffee machine has:");
        waterAmount = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milkAmount = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeebeansAmount = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cupsAmount = scanner.nextInt();

    }

    void numberOfServings() {
        int cupsProduced = 0;
        boolean produce = true;

        while(produce) {
            if (waterAmount - 200 >= 0 && milkAmount - 50 >= 0 && coffeebeansAmount - 15 >= 0) {
                waterAmount -= 200;
                milkAmount -= 50;
                coffeebeansAmount -= 15;
                cupsProduced ++;
            }
            else {
                produce = false;
            }
        }
        if (cupsAmount == cupsProduced) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cupsAmount > cupsProduced) {
            System.out.printf("No, I can make only %d cup(s) of coffee", cupsProduced);
        }
        else {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", cupsProduced-cupsAmount);
        }

    }
}

class CoffeeAdvance {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;

    void status() {

        System.out.println("The coffee machine has: ");
        System.out.printf("%d ml of water", water);
        System.out.println();
        System.out.printf("%d ml of milk", milk);
        System.out.println();
        System.out.printf("%d g of coffee beans", coffeeBeans);
        System.out.println();
        System.out.printf("%d disposable cups", cups);
        System.out.println();
        System.out.printf("$%d of money", money);
        System.out.println();
    }

    void action() {
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                buy();
                break;

            case "fill":
                fill();
                status();
                break;

            case "take":
                take();
                status();
                break;
        }
    }

    void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                espresso();
                status();
                break;

            case 2:
                latte();
                status();
                break;

            case 3:
                cappuccino();
                status();
                break;
        }
    }

    void espresso() {
        int waterAmount = 250;
        int coffeeBeansAmount = 16;
        int moneyAmount = 4;

        if (water >= waterAmount && coffeeBeans >= coffeeBeansAmount && cups >=1) {
            money += moneyAmount;
            water -= waterAmount;
            coffeeBeans -= coffeeBeansAmount;
            cups -= 1;
        }
        else
            System.out.println("Please fill Coffee Machine!");
    }

    void latte() {
        int waterAmount = 350;
        int milkAmount = 75;
        int coffeeBeansAmount = 20;
        int moneyAmount = 7;

        if (water >= waterAmount && coffeeBeans >= coffeeBeansAmount && milk >= milkAmount && cups >=1) {
            money += moneyAmount;
            water -= waterAmount;
            milk -= milkAmount;
            coffeeBeans -= coffeeBeansAmount;
            cups -= 1;
        }
        else
            System.out.println("Please fill Coffee Machine!");
    }

    void cappuccino() {
        int waterAmount = 200;
        int milkAmount = 100;
        int coffeeBeansAmount = 12;
        int moneyAmount = 6;

        if (water >= waterAmount && coffeeBeans >= coffeeBeansAmount && milk >= milkAmount && cups >=1) {
            money += moneyAmount;
            water -= waterAmount;
            milk -= milkAmount;
            coffeeBeans -= coffeeBeansAmount;
            cups -= 1;
        }
        else
            System.out.println("Please fill Coffee Machine!");
    }

    void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int waterAmount = scanner.nextInt();
        System.out.println("Write how many ml of millk you want to add: ");
        int milkAmount = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int coffeBeansAmount = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cupsAmount = scanner.nextInt();

        water += waterAmount;
        milk += milkAmount;
        coffeeBeans += coffeBeansAmount;
        cups += cupsAmount;
    }

    void take(){

        System.out.printf("I gave you $%d", money);
        System.out.println();
        money = 0;
    }

}

