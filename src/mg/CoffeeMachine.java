package mg;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
	// write your code here
        Coffee coffee = new Coffee();
        coffee.servingsNeed();
        coffee.numberOfServings();
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

