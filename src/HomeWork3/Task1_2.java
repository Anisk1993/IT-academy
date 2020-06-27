package HomeWork3;
//Сформировать строку, которая содержит 100 случайных значений
// от 0 до 1000, разделённых пробелами - StringBuilder.
public class Task1_2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(" ");
        for (int i = 0; i <100 ; i++) {
            str.append((int) (Math.random() * 1000)).append(" ");
        }
        System.out.println(str);
    }
}
