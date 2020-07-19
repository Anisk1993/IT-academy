package HomeWork4.Builder;

import HomeWork4.Interface.BuildTariff;
import HomeWork4.Tariff.Bonus;
import HomeWork4.Tariff.Tariff;
import HomeWork4.Tariff.TariffPlan;

public class Smart implements BuildTariff {
    @Override
    public TariffPlan getBonus(int cost,
                               int costMinutes,
                               int costMb,
                               Tariff smart,
                               int bonusMinutes,
                               int bonusMb){
        Bonus bonus = new Bonus(cost, costMinutes, costMb, Tariff.SMART, bonusMinutes, bonusMb);
        return null;
    }
}
