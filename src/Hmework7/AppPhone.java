package Hmework7;

import Hmework7.Ex.PhoneNameException;
import Hmework7.Ex.PhonePriceException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppPhone {

    static List<Phone> phoneList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueInput = true;
        while ( continueInput ){
            Phone phoneFromUser = getPhoneFromUser();
            phoneList.add(phoneFromUser);
            System.out.println(phoneFromUser);
            continueInput = getUserChoice();
        }
        printList(phoneList);





    }
    public static boolean getUserChoice(){
        System.out.println(" Продолжить ввод? ");
        boolean continueInput = false;
        try {
            continueInput = scanner.nextBoolean();
        } catch (Exception e){
            System.out.println(" Не сделан выбор ");
        }
        return continueInput;
    }

    public static Phone getPhoneFromUser(){

        PhoneName name = getPhoneName();

        Integer price = 7;
        try{
            price = getPriceFromUser();
        } catch (PhonePriceException e){
            System.out.println(e);
        }
        System.out.println(" Емкость аккумуляьора: ");
        Integer valueBattery = scanner.nextInt();
        return new Phone(price, valueBattery, name);
    }

    public static PhoneName getPhoneName(){

        System.out.println(" Название телефона: ");
        try {
            return doGetPhoneName();
        } catch (PhoneNameException e){
            return getPhoneName();
        }
    }

    private static PhoneName doGetPhoneName() throws PhoneNameException{
        String nameFromUser = scanner.next();
        switch (nameFromUser){
            case "apple":
                return PhoneName.APPLE;
            case "samsung":
                return PhoneName.SAMSUNG;
            case "huawei":
                return PhoneName.HUAWEI;
            default:
                throw new PhoneNameException();
        }
    }

    public static Integer getPriceFromUser() throws PhonePriceException{
        System.out.println(" Цена телефона: ");
        String priceFromUser = null;
        try{
            priceFromUser = scanner.next();
            return Integer.parseInt(priceFromUser);
        } catch (NumberFormatException e){
            throw new PhonePriceException(priceFromUser);
        }
    }

    public static void printList(List<Phone> list){
        for(Phone phone : phoneList);
        System.out.println(phoneList);

    }
}
