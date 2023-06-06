import java.util.Scanner;

public class EkoAsansörHizmeti {

    private static int katSayisi = 5; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Asansöre hoş geldin şekerim");
        System.out.println("<3 <3 <3 <3");
        System.out.println("bulunduğun katı gir şekerim (0 - " + (katSayisi - 1) + "): ");
        int bulundugunKat = input.nextInt();

        if (bulundugunKat < 0 || bulundugunKat >= katSayisi) {
            System.out.println("yanlış bu şekerim başka gir");

            return;
        }

        System.out.println("Hangi kata gitmek istiyorsun şekerim de bana hele (0 - " + (katSayisi - 1) + "): ");
        int gidilecekKat = input.nextInt();

        if (gidilecekKat < 0 || gidilecekKat >= katSayisi) {
            System.out.println("yanlış bu şekerim başka gir");

            return;
        }

        if (bulundugunKat == gidilecekKat) {
            System.out.println("Zaten bu kattasın şekerim, sanırım kafan karıştı");

            return;
        }

        System.out.println("Asansör " + bulundugunKat + ". katta.");

        if (bulundugunKat < gidilecekKat) {
            System.out.println("Yukarı çıkıyoruz kemerleri bağla...");

            for (int zeminKat = bulundugunKat + 1; zeminKat <= gidilecekKat; zeminKat++) {
                System.out.println("Asansör " + zeminKat + ". kata geldi.");
            }
        } else {
            System.out.println("Aşağı iniyoruzzz sıkı tutuun...");

            for (int zeminKat = bulundugunKat - 1; zeminKat >= gidilecekKat; zeminKat--) {
                System.out.println("Asansör " + zeminKat + ". kata geldi.");
            }
        }

        System.out.println("Hedef kata ulaştın şekerim in artık");


    }
}
