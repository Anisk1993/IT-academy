package HomeWork6.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class HashTreeMaps {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int[] array = new int[10000];

        for (int i = 0; i < 10000; i++) {
            array[i] = i;
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String put = hashMap.put(array[i], UUID.randomUUID().toString());
        }

        long endTime = System.currentTimeMillis();

        long diff = endTime - startTime;
        System.out.println("\nДобавление элементов в HashMap" + "\nЗатраченное время: " + diff + " милисекунд");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String put = treeMap.put(array[i], UUID.randomUUID().toString());
        }

        long endTime1 = System.currentTimeMillis();

        long diff1 = endTime1 - startTime1;
        System.out.println("\nДобавление элементов в TreeMap" + "\nЗатраченное время: " + diff1 + " милисекунд");

        if(diff>diff1)
            System.out.println("\nHashMap быстрее работает на добавление элементов");
        else System.out.println("\nTreeMap быстрее работает на добавление элементов");

        long startTime2 = System.currentTimeMillis();
        boolean contains = hashMap.containsKey(5000);
        long endTime2 = System.currentTimeMillis();
        long diff2 = endTime2 - startTime2;
        System.out.println("\nВремя затраченное на поиск элемента: " + diff2 + " милисекунд");

        if(contains == true){
            System.out.println("Элемент с таким ключем содержится в коллекции HashMap");
        } else System.out.println("такого эдемента нет");



        long startTime3 = System.currentTimeMillis();
        boolean contains1 = treeMap.containsKey(5000);
        long endTime3 = System.currentTimeMillis();
        long diff3 = endTime3 - startTime3;
        System.out.println("\nВремя затраченное на поиск элемента: " + diff3 + " милисекунд");

        if(contains1 == true){
            System.out.println("Элемент с таким ключем содержится в коллекции TreeMap");
        } else System.out.println("такого эдемента нет");

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String put = hashMap.remove(array[i]);
        }
        long endTime4 = System.currentTimeMillis();

        long diff4 = endTime4 - startTime4;

        System.out.println("\nВремя затраченное на удаоение элементов из HashMap: " + diff4 + "милисекунд");

        long startTime5 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String put = treeMap.remove(array[i]);
        }
        long endTime5 = System.currentTimeMillis();

        long diff5 = endTime5 - startTime5;

        System.out.println("\nВремя затраченное на удаоение элементов из TreeMap: " + diff5 + "милисекунд");




    }


}
