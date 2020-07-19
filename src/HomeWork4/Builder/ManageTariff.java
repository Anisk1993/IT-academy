package HomeWork4.Builder;

import HomeWork4.Tariff.Bonus;
import HomeWork4.Tariff.Tariff;

import static HomeWork4.Tariff.Tariff.*;

public class ManageTariff {
    private static ManageTariff buildBonus;
    private static int cost;
    private static int costMinutes;
    private static int costMb;
    static Tariff tariff;
    private static int bonusMinutes;
    private static int bonusMb;

    public static Bonus getBonus(int cost, int costMinutes, int costMb, Tariff tariff, int bonusMinutes, int bonusMb) {
        ManageTariff.cost = cost;
        ManageTariff.costMinutes = costMinutes;
        ManageTariff.costMb = costMb;
        ManageTariff.tariff = tariff;
        ManageTariff.bonusMinutes = bonusMinutes;
        ManageTariff.bonusMb = bonusMb;
        Bonus bonus = null;
        switch (tariff) {

            case SMARTMINI:
                bonus = getBonus(cost, costMinutes, costMb, SMARTMINI, bonusMinutes, bonusMb);
                break;
            case SMART:
                bonus = getBonus(cost, costMinutes, costMb, SMART, bonusMinutes, bonusMb);
                break;
            case SMARTPLUS:
                bonus = getBonus(cost, costMinutes, costMb, SMARTPLUS, bonusMinutes, bonusMb);
        }

        return bonus;
    }


}
