package Task6;

import java.util.Arrays;

public class Backpack {
    private int maxWeight;
    private Item[] items;
    private int maxCostOfBackpack;

    public int getMaxCostOfBackpack() {
        return maxCostOfBackpack;
    }

    public void setMaxCostOfBackpack(int maxCostOfBackpack) {
        this.maxCostOfBackpack = maxCostOfBackpack;
    }

    public Backpack(int maxWeight, Item[] items, int maxCostOfBackpack) {
        this.maxWeight = maxWeight;
        this.items = items;
        this.maxCostOfBackpack = maxCostOfBackpack;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "maxWeight=" + maxWeight +
                ", items=" + Arrays.toString(items) +
                ", maxOfCost" + maxCostOfBackpack +
                '}';
    }

    public int[][] getMaxCosts(int maxWeight, Item[] items) {
        int[][] matrixOfMaxCosts = new int[items.length + 1][maxWeight + 1];
        for (int i = 1; i < matrixOfMaxCosts.length; i++) {
            for (int j = 1; j < matrixOfMaxCosts[i].length; j++) {
                if (items[i - 1].getWeight() > j) {
                    matrixOfMaxCosts[i][j] = matrixOfMaxCosts[i - 1][j];
                } else
                    matrixOfMaxCosts[i][j] = findMax(matrixOfMaxCosts[i - 1][j - items[i - 1].getWeight()] + items[i - 1].getCost(), matrixOfMaxCosts[i - 1][j]);
            }
        }
        return matrixOfMaxCosts;
    }

    private int findMax(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber > 0 ? firstNumber : secondNumber;
    }

    public void printMatrix(int[][] matrixOfMaxCosts) {
        for (int i = 0; i < matrixOfMaxCosts.length; i++) {
            for (int j = 0; j < matrixOfMaxCosts[i].length; j++) {
                System.out.print(matrixOfMaxCosts[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void findMaxValueOfItems(int[][] matrixOfMaxCosts, int maxWeight, int amountOfItems) {
        if (matrixOfMaxCosts[amountOfItems][maxWeight] == 0) {
            return;
        }
        if (matrixOfMaxCosts[amountOfItems - 1][maxWeight] == matrixOfMaxCosts[amountOfItems][maxWeight]) {
            findMaxValueOfItems(matrixOfMaxCosts, maxWeight, amountOfItems - 1);
        } else {
            findMaxValueOfItems(matrixOfMaxCosts, maxWeight - items[amountOfItems - 1].getCost(), amountOfItems - 1);
            maxCostOfBackpack += items[amountOfItems].getCost();
            System.out.println(" The most valuable items: " + amountOfItems);
        }
    }
}