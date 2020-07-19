package HomeWork4.Interface;

import HomeWork4.Tariff.Tariff;
import HomeWork4.Tariff.TariffPlan;

public interface BuildTariff {
    default TariffPlan getBonus() {
        return getBonus();
    }

    default TariffPlan getBonus(int cost, int costMinutes, int costMb, Tariff tariff, int bonusMinutes, int bonusMb) {

        return null;
    }

}
