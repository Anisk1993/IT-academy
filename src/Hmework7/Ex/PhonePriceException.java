package Hmework7.Ex;

public class PhonePriceException extends Exception{

    public PhonePriceException(){
        super(" Ошибка в цене телефона ");
    }

    public PhonePriceException(String price){
        super(" Ошибка в цене телефона: " + price);
    }

}
