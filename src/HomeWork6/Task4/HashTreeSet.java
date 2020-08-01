package HomeWork6.Task4;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.UUID;

public class HashTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            treeSet.add(UUID.randomUUID().toString());
        }
        long endTime = System.currentTimeMillis();

        long diff = endTime - startTime;
        System.out.println("Время на заполнение коллекции TreeSet: " + diff + " милисекунд");


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            hashSet.add(UUID.randomUUID().toString());
        }
        long endTime1 = System.currentTimeMillis();

        long diff1 = endTime1 - startTime1;
        System.out.println("Время на заполнение коллекции HashSet: " + diff1 + " милисекунд");


        long startTime2 = System.currentTimeMillis();
        boolean contains = treeSet.contains(UUID.randomUUID().toString());
        long endTime2 = System.currentTimeMillis();

        long diff2 = endTime2 - startTime2;
        System.out.println("\nВремя на элкмкета в коллекции TreeSet: " + diff2 + " милисекунд");
        if (contains == false) {
            System.out.println("Такого элемента нет в коллекции TreeSet");
        } else System.out.println("Элемент содержится в коллекции");

        long startTime3 = System.currentTimeMillis();
        boolean contains1 = hashSet.contains(UUID.randomUUID().toString());
        long endTime3 = System.currentTimeMillis();

        long diff3 = endTime3 - startTime3;
        System.out.println("\nВремя на элкмкета в коллекции HashSet: " + diff3 + " милисекунд");
        if (contains == false) {
            System.out.println("Такого элемента нет в коллекции HashSet");
        } else System.out.println("Элемент содержится в коллекции");


        long startTime4 = System.currentTimeMillis();
            treeSet.removeAll(treeSet);
        long endTime4 = System.currentTimeMillis();

        long diff4 = endTime4 - startTime4;
        System.out.println("\nВремя на удаление элементов коллекции TreeSet: " + diff4 + " милисекунд");

        long startTime5 = System.currentTimeMillis();
        hashSet.removeAll(hashSet);
        long endTime5 = System.currentTimeMillis();

        long diff5 = endTime5 - startTime5;
        System.out.println("\nВремя на удаление элементов коллекции HashSet: " + diff5 + " милисекунд");
    }

}
