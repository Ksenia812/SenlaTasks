package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the max weight of backpack:");
        Scanner scanner = new Scanner(System.in);
        int maxWeight = scanner.nextInt();
        System.out.println("Input the amount of items:");
        int amountOfItems = scanner.nextInt();
        Item[] items = new Item[amountOfItems];
        for (int i = 0; i < items.length; i++) {
            System.out.println("input the weight of " + i + ":");
            int weight = scanner.nextInt();
            System.out.println("input the cost of " + i + ":");
            int cost = scanner.nextInt();
            items[i] = new Item(i, weight, cost);
        }

        Backpack backpack = new Backpack(maxWeight, items, 0);
        int[][] maxCosts = backpack.getMaxCosts(maxWeight, items);
        backpack.printMatrix(maxCosts);
        backpack.findMaxValueOfItems(maxCosts, maxWeight, amountOfItems);
        System.out.println("Max cost of backpack is: " + backpack.getMaxCostOfBackpack());
    }
}
