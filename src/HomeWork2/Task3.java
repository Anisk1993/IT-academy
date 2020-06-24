package HomeWork2;



import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {

        int number = 7;
        System.out.println("Задано число от 1 до 9. Угадайте это число. Если вы передумали, нажмите '0' для выхода\n");
        int i;



            for (i = 3; i >= 0; i--) {
                Scanner in = new Scanner(System.in);
                System.out.println("Напишите ваш ответ : ");
                int answer = in.nextInt();

                if (answer==0){
                    System.out.println("Попробуйте в другой раз");
                break;
                }

                if (answer > number ) {
                    System.out.print("Вы не угадали");
                    System.out.println("Загаданное число меньше");
                }
                    else if (answer < number) {
                    System.out.print("Вы не угадали. ");
                    System.out.println("Загаданное число больше");
                    } else {
                    System.out.println("Вы угадали!!!");
                    break;
                }

                System.out.println("Осталось " + i + " попыток");
            }

            }
        }

