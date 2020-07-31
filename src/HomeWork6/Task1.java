package HomeWork6;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("we are learning java programming");
        System.out.println(str);
        Map<Character, Integer> strList = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {


            Character key = str.charAt(i);
            strList.put(key, strList.getOrDefault(key, 0) + 1);

        }

        System.out.println(strList);

    }

}
