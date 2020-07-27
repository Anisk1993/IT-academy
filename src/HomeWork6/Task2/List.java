package HomeWork6.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class List extends ListCar {
    public List(String auto, String speed) {
        super(auto, speed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, brand , speed;
        boolean q = true;
        ArrayList<ListCar> car = new ArrayList<ListCar>();

        while ( q ){
            System.out.println("Марка: ");
            brand = scanner.nextLine();
            System.out.println("Скорость: ");
            speed = scanner.nextLine();

            try {
                car.add(new ListCar(brand, speed));
            } catch (Exception e) {
                e.printStackTrace();
            }

            while (true){
            System.out.println("Добавить еще? Y/N: ");
            str = scanner.nextLine();
            if((str.toLowerCase()).equals("y")){
                break;
            }else{
                q = false;
                break;
            }
        }

        }
        System.out.println(car);


    }
}
