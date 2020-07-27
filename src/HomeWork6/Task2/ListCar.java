package HomeWork6.Task2;

public class ListCar {
    String auto;
    String speed;

    public ListCar(String auto, String speed) {
        this.auto = auto;
        this.speed = speed;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return " Список машин:\n" +
                "   Марка: " + auto + '\n' +
                "   Скорость =" + speed + "\n";
    }
}
