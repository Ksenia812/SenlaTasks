package Task5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input = null;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the end of the sequence:");
            input = scanner.nextLine();


        }
        while (!isCorrectInput(input));
        int N = Integer.parseInt(input);
        findPalindrome(N);
    }

    private static void findPalindrome(int N) {
        for (int i = 0; i <= N; i++) {
            String number = String.valueOf(i);
            StringBuilder reverseNumber = new StringBuilder(number).reverse();
            if (number.equals(reverseNumber.toString())) {
                System.out.println(number);

            }
        }
    }

    private static boolean isCorrectInput(String number) {

        try {
            int wholeNumber = Integer.parseInt(number);
            if (wholeNumber > 100 || wholeNumber < 0) {
                System.out.println("Your input is incorrect");
                return false;
            }
        } catch (Exception e) {
            System.out.println(number + " is not a whole number");
            return false;
        }
        return true;
    }


}

