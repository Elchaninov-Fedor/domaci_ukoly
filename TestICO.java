package elchaninov;

import java.util.Scanner;

public class TestICO {
    public static void main(String[] args) {

        // tento program nefunguje v pripade, kdyz ICO se zacina nulou

        final int MINIMALNI_ICO = 10_000_000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte ICO: "); //napr. 25596641
        int ico = sc.nextInt();
        if (ico < MINIMALNI_ICO) System.out.println("Zadali jste neplatne ICO");
        else{
            int n8 = ico / 10_000_000;
            int n7 = (ico % 10_000_000) / 1_000_000;
            int n6 = (ico % 1_000_000) / 100_000;
            int n5 = (ico % 100_000) / 10_000;
            int n4 = (ico % 10_000) / 1_000;
            int n3 = (ico % 1_000) / 100;
            int n2 = (ico % 100) / 10;
            int n1 = ico % 10;
            int kontrolniCislice = (11 - (8*n8 + 7*n7 + 6*n6 + 5*n5 + 4*n4 + 3*n3 + 2*n2) % 11) % 10;
            if (kontrolniCislice == n1) System.out.println("Zadali jste platne ICO");
            else System.out.println("Zadali jste neplatne ICO");

        }
    }
}
