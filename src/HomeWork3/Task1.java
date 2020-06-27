package HomeWork3;
//Сформировать строку, которая содержит 100 случайных значений
// от 0 до 1000, разделённых пробелами - String
public class Task1 {
    public static void main(String[] args) {
    String str = "";

        for (int i = 0; i <100 ; i++) {
            str = str.concat((int) (Math.random() * 1000) + " ");
        }
        System.out.println(str);
    }
}
