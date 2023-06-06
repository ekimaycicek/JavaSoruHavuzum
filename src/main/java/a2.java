import java.text.DecimalFormat;
import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi gir ");
        double yuksek = input.nextDouble();

        double toplam = 0;
        int yereVurmaSayisi = 0;

        do {

            yereVurmaSayisi++;
            toplam += yuksek;
            yuksek *=  0.75;
            toplam += yuksek;
        }while (yuksek > 1);

        toplam += yuksek;

        DecimalFormat dc = new DecimalFormat("0.00");

        System.out.println("Toplam Yol: " + dc.format(toplam));
        System.out.println("Yere Vurma Sayısı: " + yereVurmaSayisi);

    }
}
