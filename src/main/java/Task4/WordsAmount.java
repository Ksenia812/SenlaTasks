package Task4;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String text = scanner.nextLine();
        System.out.println("Input the search word:");
        String searchWord = scanner.nextLine();
        getAmountOfWords(text, searchWord);

    }

    private static void getAmountOfWords(String input, String searchWord) {
        Predicate<String> isEquals = i -> (i.equals(searchWord.toUpperCase()));
        int countMatches = (int) Stream.of(input.toUpperCase().trim().split("\\s*(\\p{Punct})+\\s*")).
                filter(isEquals).count();
        System.out.println(countMatches);


    }
}