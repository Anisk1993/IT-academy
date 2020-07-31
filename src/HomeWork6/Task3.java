package HomeWork6;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        PriorityQueue<Integer> myQueue = new PriorityQueue<>(10);
        for (int i = 1; i < 11; i++) {
            myQueue.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {

            System.out.println("Обаботка очереди :  ");
            int num = scanner.nextInt();

            Integer int1 = myQueue.poll();
            System.out.println(int1);

            if (int1 == 5) {
                System.out.println("Вы выйграли!");
                break;
            }

        }

    }

}

