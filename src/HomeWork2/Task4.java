package HomeWork2;

import java.util.Scanner;

/*
Пользователь вводит число в небольшом диапазоне. Программа должна угадать,
что это за число и продемонстрировать количество попыток, которое потребовалось для угадывания.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в диаппазоне от 0 до 9: ");
        int number = in.nextInt();
        int computerAnsewer;
        int counter = 0;
        do{
            counter++;
            computerAnsewer = (int) (Math.random()*10);
            System.out.println(computerAnsewer);
            System.out.println("Попытка: "+ counter);
           }while ( computerAnsewer != number );
            System.out.println("Потребовалось " + counter + " попыток");



        //System.out.println(computerAnswer);
    }

}
