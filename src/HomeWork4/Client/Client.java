package HomeWork4.Client;

import HomeWork4.Tariff.Bonus;

public class Client {
    private String name;
    private String number;
    private Bonus tariff;

    public Client(String name, String number, Bonus tariff) {
        this.name = name;
        this.number = number;
        this.tariff = tariff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void getTariff() {
    }

    public void setTariff(Bonus tariff) {
        this.tariff = tariff;
    }
}
