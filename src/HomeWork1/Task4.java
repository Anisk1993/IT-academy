/* Задано число. Определить, близко ли к
нему другое введенное число (в пределах 10%)
 */

package HomeWork1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double a = in.nextDouble();
        System.out.print("Введите второе число : ");
        double b = in.nextDouble();

        double percent = b/a;
        System.out.println(percent);
        if (percent<=1.1 && percent>=0.9) {
            System.out.println("\nЧисло b находится в пределах 10% от числа а");
        }
        else {
            System.out.println("\nЧисло b находится далеко от числа а");
        }
    }
}
