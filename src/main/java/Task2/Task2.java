package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String firstInput = null;
        String secondInput = null;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the first number:");
            firstInput = scanner.nextLine();
            System.out.println("Input the second number:");
            secondInput = scanner.nextLine();

        }
        while (!isCorrectInput(firstInput, secondInput));

        int firstNumber = Integer.parseInt(secondInput);
        int secondNumber = Integer.parseInt(secondInput);

        System.out.println("The Greater Common Divide is " + findGCD(firstNumber, secondNumber));
        System.out.println("The Least Common Multiple is: " + findLCM(firstNumber, secondNumber));
    }

    private static boolean isCorrectInput(String... args) {

        try {

            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            if (firstNumber < 0 || secondNumber < 0) {
                System.out.println("Input is a negative number");
                return false;
            }

        } catch (Exception e) {
            System.out.println("The input is not a whole number");
            return false;
        }
        return true;
    }

    private static int findGCD(int firstNumber, int secondNumber) {
        return secondNumber == 0 ? firstNumber : findGCD(secondNumber, firstNumber % secondNumber);
    }

    private static int findLCM(int firstNumber, int secondNumber) {
        return firstNumber / findGCD(firstNumber, secondNumber) * secondNumber;
    }
}




