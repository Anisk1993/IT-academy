package HomeWork1;
/*Даны два числа, задающие три диапазона чисел.
Определить, какому диапазону принадлежит введенное пользователем число.
 */

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.print("Введите первое число диапазона : ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число диапазона : ");
        int num2 = in.nextInt();
        System.out.print("Введите число : ");
        AtomicInteger a = new AtomicInteger(in.nextInt());

        if (a.get() <=num1 && a.get() <=num2) {
            System.out.println("Число а находится в первом дипазоне");
        }
        else if (a.get() >num1 && a.get() <=num2 || a.get() <=num1 && a.get() >num2){
            System.out.println("Число а находится во втором диапазоне");
        }
            else if (a.get() >num1 && a.get() >num2){
            System.out.println("Число а находится в третьем диапазоне");
        }



    }
}
