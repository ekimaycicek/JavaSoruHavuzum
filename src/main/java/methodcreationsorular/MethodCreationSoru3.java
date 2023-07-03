package methodcreationsorular;

import java.util.Scanner;

public class MethodCreationSoru3 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("saat giriniz: ");
        double saat = sc.nextDouble();
        System.out.println("mil giriniz: ");
        double mil = sc.nextDouble();
        System.out.println("kilo giriniz: ");
        double kilo = sc.nextDouble();


        turn(saat,mil,kilo);

    }

    public static void turn(double saat, double mil, double kilo) {

        double sn = saat * 60;
        double km = mil * 1000;
        double gr = kilo * 1000;


        System.out.println("sn = " + sn + "\nkm: "+ km + "\ngr: " + gr);
    }
}
