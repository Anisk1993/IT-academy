package Hmework7.Ex;

public class PhoneNameException extends Exception {

    public PhoneNameException(){
        super(" Ошибка названия телефона ");
    }

    public PhoneNameException(String name){
        super(" Ошибка названия телефона: " + name);

    }

}
