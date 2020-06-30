package HomeWork3;
/*
Пользователь вводит имя и возраст. Вывести сообщение, приветствующее пользователя.
- форматирование (String.format) через спецификаторы
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.next();
        System.out.println();
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.format("Приветствую Вас %s. Ваш возраст %d",name, age);
    }
}
