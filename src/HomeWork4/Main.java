package HomeWork4;

import HomeWork4.Builder.ManageTariff;
import HomeWork4.Client.Client;
import HomeWork4.Tariff.Bonus;
import HomeWork4.Tariff.TariffPlan;

import java.util.ArrayList;
import java.util.List;

import static HomeWork4.Tariff.Tariff.*;

public class Main {
    private static Object Client;

    public static void main(String[] args) {

        Bonus Smart = ManageTariff.getBonus(12, 1,2, SMART, 500, 500);
        Bonus SmartMini = ManageTariff.getBonus(10,2,3, SMARTMINI, 400,400);
        Bonus SmartPlus = ManageTariff.getBonus(11,1,1,SMARTPLUS, 600,600);

        List<TariffPlan>tariff = new ArrayList<TariffPlan>();
        List<HomeWork4.Client.Client>client = new ArrayList<Client>();

        tariff.add(Smart);
        tariff.add(SmartMini);
        tariff.add(SmartPlus);

        Client client1 = new Client("Ольга", "+375293344668", Smart);
        Client client2 = new Client("Игорь", "+37529696964", Smart);
        Client client3 = new Client("Федор","+375336565656", SmartMini);
        Client client4 = new Client("Тимофей", "+375297858596", SmartPlus);
        
        tariff.add((TariffPlan) Client);

        System.out.println("Количество клиентов: " + client.size());
        for(TariffPlan bonus : tariff) {
            System.out.println(bonus);
        }

    }
}
