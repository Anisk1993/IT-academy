package HomeWork2;



import java.util.Scanner;

/*
Вывести пирамиду из цифр. Размер вводится пользователем. Пирамида - фигура такого вида:
1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2 2 1
1 1 1 1 1
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array(must be odd) : ");
        int size=in.nextInt();

        int[][] array = new int[size][size];
        int i,j;

            for (i = 0; i <array.length; i++) {
                for (j = 0; j <array[i].length; j++) {
                    if(size%2==0)
                        array[array.length/2][array.length/2]= size/2;
                    if(size/2>0)
                        array[array.length/2][array.length/2]= size/2+1;

                    //заполнение квадратов начиная от центра
                    if(i==5 || j==5 || i==size-6 || j==size-6)
                        array[i][j]=6;
                    if(i==4 || j==4 || i==size-5 || j==size-5)
                        array[i][j]=5;
                    if(i==3 || j==3 || i==size-4 || j==size-4)
                        array[i][j]=4;
                    if(i==2 || j==2 || i==size-3 || j==size-3)
                        array[i][j]=3;
                    if(i==1 || j==1 || i==size-2 || j==size-2)
                        array[i][j]=2;
                    if(i==0 || j==0 || i==size-1 || j==size-1)
                        array[i][j]=1;

                    System.out.print(" "+array[i][j]+" ");
                }
                System.out.println();
                }

        }


    }
