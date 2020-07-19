package HomeWork4.Tariff;

public class Bonus extends TariffPlan {
    private int bonusMinutes;
    private int bonusMb;

    public Bonus(int costMinutes, int costMb, int cost, Tariff tariff, int bonusMinutes, int bonusMb) {
        super(costMinutes, costMb, cost);

        this.bonusMinutes = bonusMinutes;
        this.bonusMb = bonusMb;
    }

    public int getBonusMinutes() {
        return bonusMinutes;
    }

    public void setBonusMinutes(int bonusMinutes) {
        this.bonusMinutes = bonusMinutes;
    }

    public int getBonusMb() {
        return bonusMb;
    }

    public void setBonusMb(int bonusMb) {
        this.bonusMb = bonusMb;
    }
}

