package elchaninov;

import java.util.Scanner;

public class KvadratickaRovnice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte koeficienty a, b, c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        

        if (a == 0) {
            System.out.println("a = 0, a proto nejedna se o kvadratickou rovnici");
            if(b == 0){
                System.out.println("b = 0, a proto nejedna se o rovnici celkem");
            }else{
                System.out.println("Jedna se o reseni linearni rovnici");
                double x = ((-c) / b);
                System.out.println("Resenim je: " + x);
            }
        }else{
            double d = Math.pow(b, 2) - (4 * a * c);
            if (d < 0){
                double realniCast = (-b) / (2 * a);
                double imaginarniCast = Math.sqrt(-d) / (2 * a);
                System.out.println("Resenim je: ");
                System.out.println("Prvni koren: " + realniCast + " + " + imaginarniCast + "i");
                System.out.println("Druhy koren: " + realniCast + " - " + imaginarniCast + "i");
            }else{
                double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
                System.out.println("Resenim je: ");
                System.out.println("Prvni koren: " + x1);
                System.out.println("Druhy koren: " + x2);
            }
        }
    }
}
