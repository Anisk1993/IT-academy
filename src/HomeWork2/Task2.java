package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите номер месяца : ");
        int mon=in.nextInt();
        System.out.print("Введите день : ");
        int day=in.nextInt();

        int[][]month=new int[12][];
        months(month);
        int i, j;
        for (i = 0; i <month.length ; i++)
            for (j = 0; j < month[i].length; j++) {
                month[i][j] = j + 1;

            }
        if(month[mon-1][month[mon-1].length-1]==day)
            System.out.println("Такой день в этом месяце есть");
            else System.out.println("Такого дня нет");

    }

    private static void months(int[][] month) {
        month[0]=new int[31];
        month[1]=new int[28];
        month[2]=new int[31];
        month[3]=new int[30];
        month[4]=new int[31];
        month[5]=new int[30];
        month[6]=new int[31];
        month[7]=new int[31];
        month[8]=new int[30];
        month[9]=new int[31];
        month[10]=new int[30];
        month[11]=new int[31];
    }

}
