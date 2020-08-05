package HomeWork8;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        String stringBuilder = "The new license permits certain uses, " +
                "such as personal use and development use, at no cost - but other uses authorized " +
                "under prior Oracle Java licenses may no longer be available";

        String[] wordsArray = stringBuilder.split(" ");
        List<String> words = Arrays.asList(wordsArray);
        words.stream()
                .map(String::toLowerCase)
                .filter(word -> word.startsWith("a"))
                .forEach(System.out::println);


    }
}
