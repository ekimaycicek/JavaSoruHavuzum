package taksi;

import java.util.Scanner;

public class EkoTaksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gittiğin mesafeyi kilometre cinsinden gir şekerim: ");
        double mesafe = input.nextDouble();

        double toplamÜcret = ucretHesapla(mesafe);
        System.out.println("Toplam ücret: " + toplamÜcret + " TL");


    }

    public static double ucretHesapla(double mesafe) {
        double baslangic = 8.00;
        double kmBasina = 12.50;

        double toplamÜcret = baslangic + (kmBasina * mesafe);
        return toplamÜcret;
    }
}
