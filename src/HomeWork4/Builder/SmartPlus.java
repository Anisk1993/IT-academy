package HomeWork4.Builder;

import HomeWork4.Interface.BuildTariff;
import HomeWork4.Tariff.Bonus;
import HomeWork4.Tariff.Tariff;

public class SmartPlus implements BuildTariff {
    public Bonus getBonus(int cost,
                          int costMinutes,
                          int costMb,
                          Tariff smartPlus,
                          int bonusMinutes,
                          int bonusMb){
        Bonus bonus = new Bonus(cost, costMinutes, costMb, Tariff.SMARTPLUS, bonusMinutes, bonusMb);
        return bonus;
    }
}
