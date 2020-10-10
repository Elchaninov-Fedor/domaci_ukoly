package elchaninov;

import java.util.Scanner;

public class VypocetGeomTeles {

    //nejsem jisty, ze jsem spravne pochopil zadani

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte delky stran kvadru (a b c): ");
        int stranaA = sc.nextInt();
        int stranaB = sc.nextInt();
        int stranaC = sc.nextInt();


        int objemKvadru = stranaA * stranaB * stranaC; //objemKvadru = objemKrychle = objemKoule = objemCtyrstenu
        int plochaPlasteKvadru = 2 * (stranaA * stranaB + stranaB * stranaC + stranaA * stranaC);
        System.out.println("Objem kvadru: " + objemKvadru);
        System.out.println("Plocha plaste kvadru: " + plochaPlasteKvadru + "\n");

        System.out.printf("------Pres stejne objemy------\n");

        double delkaStranyKrychle = Math.pow(objemKvadru, 1.0/3.0);
        //double plochaPlasteKrychle = 6 * Math.pow(delkaStranyKrychle, 2.0); //podle zadani je zbytecne?
        System.out.println("Delka strany krychle: " + delkaStranyKrychle);
        //System.out.println("plocha plaste krychle: " + plochaPlasteKrychle + "\n");

        double polomerKoule = Math.pow(((objemKvadru * 0.75)/ Math.PI), 1.0/3.0);
        //double plochaPlasteKoule = 4 * Math.PI * Math.pow(polomerKoule, 2.0); //podle zadani je zbytecne?
        System.out.println("Polomer koule: " + polomerKoule);
        //System.out.println("Plocha plaste koule: " + plochaPlasteKoule + "\n");

        double delkaStranyCtyrstenu = Math.pow((objemKvadru * (12/Math.pow(2, 1.0/2.0))), 1.0/3.0);
        //double plochaPlasteCtyrstenu = Math.pow(3, 1.0/2.0) * Math.pow(delkaStranyCtyrstenu, 2.0); //podle zadani je zbytecne?
        System.out.println("Delka strany ctyrstenu: " + delkaStranyCtyrstenu + "\n");
        //System.out.println("Plocha plaste ctyrstenu: " + plochaPlasteCtyrstenu + "\n");


        System.out.printf("------Pres stejne plochy------\n"); //vsichni plochy jsou stejne

        delkaStranyKrychle = Math.pow((plochaPlasteKvadru / 6.0), 1.0/2.0);
        polomerKoule = Math.pow((plochaPlasteKvadru / (4 * Math.PI)), 1.0/2.0);
        delkaStranyCtyrstenu = Math.pow(plochaPlasteKvadru / Math.pow(3, 1.0/2.0), 1.0/2.0);

        System.out.println("Delka strany krychle pres stejne plochy: " + delkaStranyKrychle);
        System.out.println("Polomer koule pres stejne plochy: " + polomerKoule);
        System.out.println("Delka strany ctyrstenu pres stejne plochy: " + delkaStranyCtyrstenu);

    }
}
