package Hmework7;

public class Phone {

    private int price;
    private int valueBattery;
    private PhoneName name;

    public Phone(Integer price, Integer valueBattery, PhoneName name) {
        this.price = price;
        this.valueBattery = valueBattery;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValueBattery() {
        return valueBattery;
    }

    public void setValueBattery(int valueBattery) {
        this.valueBattery = valueBattery;
    }

    public String getName() {
        return String.valueOf(name);
    }

    public void setName(PhoneName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", valueBattery=" + valueBattery +
                ", name='" + name + '\'' +
                '}';
    }
}
