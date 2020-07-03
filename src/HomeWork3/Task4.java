package HomeWork3;
/*
Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова
 */
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {

        String str = "Разбить строку на отдельные слова и " +
                "посчитать количество вхождений для каждого слова";
        str = str.toLowerCase();

        String[] array = str.split("\\s");
        System.out.println(Arrays.toString(array));

        Map<String, Integer> map= new TreeMap<>();
        int i=0;
        while ( i<array.length ) {

            Integer count=map.get(array[i]);
            if(count == null){
                count=0;
            }

            map.put(array[i],++count);
            System.out.println("Количество вхождений слова: " +"\"" + array[i] + "\" - " +  count);
            i++;
        }

    }

}
