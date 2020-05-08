package Task3;

import org.apache.commons.text.WordUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        System.out.println("Input the text:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        analyzeText(input);

    }

    private static void analyzeText(String input) {

        String delimiter = " ";
        List<String> words = Stream.of(input.trim().split(delimiter)).
                map(WordUtils::capitalize).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted words:");
        words.forEach(System.out::println);
        System.out.println("The words amount is: " + words.size());
    }
}
