package Task1;

import java.util.Scanner;
//Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным,
// простым или составным.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

public class CheckNumber {
    public static void main(String[] args) {
        String input = null;
        do {
            System.out.println("Input the number:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }
        while (!isWholeNumber(input));

        int number = Integer.parseInt(input);
        isPrimeOrComplex(number);
        isEvenOrOdd(number);


    }

    private static void isPrimeOrComplex(int number) {


        for (int i = 2; i * i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + "  is complex");
                return;
            }
        }
        System.out.println(number + " is prime");
    }

    private static boolean isWholeNumber(String number) {

        try {
            int wholeNumber = Integer.parseInt(number);

        } catch (Exception e) {
            System.out.println(number + " is not a whole number");
            return false;
        }
        return true;
    }

    private static void isEvenOrOdd(int number) {
        String evenOrOdd = number % 2 == 0 ? number + " is even" : number + " is odd";
        System.out.println(evenOrOdd);
    }

}
