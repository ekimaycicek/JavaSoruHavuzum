import java.util.Scanner;

public class aaaaaaabcdef {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // KAHVE
        System.out.println("Hangi kahveyi istersiniz?\n1. Türk kahvesi\n2. Filtre kahve\n3. Espresso");
        String hangiKahve = input.next().toLowerCase();
        switch (hangiKahve) {
            case "1":
                System.out.println("Türk kahvesiniz hazırlanıyor...");
                break;
            case "2":
                System.out.println("Filtre kahveniz hazırlanıyor...");
                break;
            case "3":
                System.out.println("Espressonuz hazırlanıyor...");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız.");
        }

        // SÜT
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        String sut = input.next().toLowerCase();
        if (sut.equals("evet")) {
            System.out.println("Süt ekleniyor... ");
        } else {
            System.out.println("Süt eklenmiyor.");
        }

        // ŞEKER
        input.nextLine();
        System.out.println("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        String seker = input.nextLine().toLowerCase();

        if (seker.equals("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacseker = input.nextInt();
            System.out.println(kacseker + " şeker ekleniyor.");
        } else {
            System.out.println("Şeker eklenmiyor.");
        }

        input.nextLine();

        // BOYUT
        System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy olarak giriniz.)");
        String boyut = input.nextLine().toLowerCase();
        if (boyut.equals("büyük boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equals("orta boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        } else if (boyut.equals("küçük boy")) {
            System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
        }
        System.out.println("Kahveniz " + boyut + " hazırdır. Afiyet olsun.");


    }
}
