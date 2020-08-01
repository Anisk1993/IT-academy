package HomeWork6;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        PriorityQueue<Integer> myQueue = new PriorityQueue<>(10);
        for (int i = 1; i < 11; i++) {
            myQueue.add(i);
        }
        System.out.println("обозначьте вытягивание введением любого число. " +
                "\n элементы вытягиваютя по порядку :  ");
        for (int i = 1; i < 11; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Обработка очередди : ");

            int num = scanner.nextInt();
            System.out.println(num);

            Integer int1 = myQueue.poll();
            System.out.println(num +" : "+ int1);

            if (int1 == 5) {
                System.out.println("Вы выйграли!");
                break;
            }

        }

    }

}

