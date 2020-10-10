package elchaninov;

import java.util.Scanner;

public class UsekovaRychlost {

  //Chapu, ze jsem mohl udelat tento ukol pouzitim mensiho mnozstvi promennych,
    // ale udelal jsem takhle pro lepsi porozumeni

    public static void main(String[] args) {

        final int MINUTY_V_HODINE = 60;
        final int SEKUNDY_V_MINUTE = 60;

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte maximalni rychlost ve useku (km/h): ");
        int maxRychlost = sc.nextInt();

        System.out.print("Zadejte delku useku (km): ");
        int usekovaDelka = sc.nextInt();

        System.out.print("Zadejte cas prujezdu vozidla zacatkem useku (hh mm ss): ");
        int startCasHodiny = sc.nextInt();
        int startCasMinuty = sc.nextInt();
        int startCasSekundy = sc.nextInt();

        System.out.print("Zadejte cas prujezdu koncem useku (hh mm ss): ");
        int konecCasHodiny = sc.nextInt();
        int konecCasMinuty = sc.nextInt();
        int konecCasSekundy = sc.nextInt();

        int startCasCelkemSekund = (startCasHodiny * (MINUTY_V_HODINE * SEKUNDY_V_MINUTE)) +
                (startCasMinuty * SEKUNDY_V_MINUTE) + startCasSekundy;

        int konecCasCelkemSekund = (konecCasHodiny * (MINUTY_V_HODINE * SEKUNDY_V_MINUTE)) +
                (konecCasMinuty * SEKUNDY_V_MINUTE) + konecCasSekundy;

        float celkovyCasPrujezdu = (float)(konecCasCelkemSekund - startCasCelkemSekund)/
                (MINUTY_V_HODINE * SEKUNDY_V_MINUTE);

        float prumernaRychlost = usekovaDelka / celkovyCasPrujezdu;

        System.out.println("prumerna rychlost je: " + (int)prumernaRychlost + " km/h");

       /* if (prumernaRychlost > maxRychlost) System.out.println("maximalni povolena rychlost byla prekrocena o: "
                + ((int)prumernaRychlost - maxRychlost) + " km/h");
        else System.out.println("maximalni povolena rychlost nebyla prekrocena");
        */

        String vysledek = (prumernaRychlost > maxRychlost) ? "maximalni povolena rychlost byla prekrocena"
                : "maximalni povolena rychlost nebyla prekrocena"; //pouzitim ternarniho operatoru

        System.out.print(vysledek + " (" + (int)(prumernaRychlost - maxRychlost) + "km/h ve vztahu k limitu)");



    }
}
