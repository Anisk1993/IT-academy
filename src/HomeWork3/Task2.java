package HomeWork3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(" ");
        for (int i = 0; i < 100; i++) {
            str.append((int) (Math.random() * 1000)).append(" ");
        }
        System.out.println(str);

        String pattern = "\\s\\d{2}\\s";

        Pattern pat = Pattern.compile(pattern);
        Matcher m = pat.matcher(str);
        String str1 = null;
        while (m.find()){
            if(m.end() - m.start() == 4) {
                str1 = m.replaceAll(" -1 ");
            }
        }
            System.out.println(str1);

    }
}
