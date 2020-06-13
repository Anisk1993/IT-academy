package HomeWork1;
/*Заданы три числа. Найти среди них минимальное,
 максимальное и среднее арифметическое и вывести.
 */

import java.util.Scanner;
public class Task3 {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int a = in.nextInt();
        System.out.print("Введите второе число : ");
        int b = in.nextInt();
        System.out.print("Ввелите третье число : ");
        int c = in.nextInt();
//найдем максимальное число
        if (a>b && a>c){
            System.out.println("\nа - максимальное число");
        }
        else if(b>a && b>c){
            System.out.println("\nb - максимальное число");
                    }
            else if (c>a && c>b){
            System.out.println("\nc - максимальное число");
        }       else {
            System.out.println("\nНесколько чисел с максимальным значением");
        }
//найдем минимальное число
        if (a<b && a<c){
            System.out.println("а - минимальное число");
        }
        else if(b<a && b<c){
            System.out.println("b - минимальное число");
        }
            else if (c<a && c<b){
            System.out.println("c - минимальное число");
        }
            else {
            System.out.println("Несколько чисел с минимальным значением");
        }
//среднее арифметическое
        double mean = (double)(a+b+c)/3;
        System.out.println("\nсреднее арифметичеcкое = " + mean);
    }
}
