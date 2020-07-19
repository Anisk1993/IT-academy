package HomeWork4.Tariff;

public class TariffPlan {
    int costMinutes;
    int costMb;
    int cost;

    public TariffPlan(int costMinutes, int costMb, int cost) {
        this.costMinutes = costMinutes;
        this.costMb = costMb;
        this.cost = cost;
    }

    public int getCostMinutes() {
        return costMinutes;
    }

    public void setCostMinutes(int costMinutes) {
        this.costMinutes = costMinutes;
    }

    public int getCostMb() {
        return costMb;
    }

    public void setCostMb(int costMb) {
        this.costMb = costMb;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
