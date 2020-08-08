package HomeWork8;

import java.util.Optional;
import java.util.stream.Stream;

public class Task3{
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6);
        Optional<Integer> res = numbers.min(Integer::compare);
        System.out.println("минимальное значение в numbers: ");
        res.ifPresentOrElse(System.out::print, () -> System.out.println("Элемент не найден"));

        System.out.println();

        Stream<Integer>numbers1 = Stream.of();
        Optional<Integer>res1 = numbers1.min(Integer::compare);
        System.out.println("минимальное значение в numbers1: ");
        res1.ifPresentOrElse(System.out::print, () -> System.out.println("Элемент не найден"));
    }
}