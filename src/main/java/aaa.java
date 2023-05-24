import java.util.Scanner;

public class aaa {

    public static void main(String[] args) {


        /*
Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.

a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km"
yazmalıdır (sayı dinamik olacak)

b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)

c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz
"28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dönüştürmek istediğiniz değeri girin:");
        double deger = scanner.nextDouble();

        System.out.println("Dönüşüm operatörünü girin (mildenKmye, saniyedenSaate, fahrenheitanSantigrata):");
        String operator = scanner.next();

        double sonuc;

        switch (operator) {
            case "mildenKme":
                sonuc = deger * 1.60934;
                System.out.println(sonuc + " km");
                break;
            case "saniyedenSaate":
                sonuc = deger / 3600;
                System.out.println(sonuc);
                break;
            case "fahrenhaytdanSantigrata":
                sonuc = (deger - 32) * 5 / 9;
                System.out.println(sonuc + " santigrat");
                break;
            default:
                System.out.println("Geçersiz operatör girdiniz");
        }


        Scanner input = new Scanner(System.in);

        System.out.print("Bir tamsayı girin");
        int sayi7 = scanner.nextInt();

        boolean asalMi = true;

        if (sayi7 <= 1) {
            asalMi = false;
        } else {
            for (int i = 2; i <= sayi7 / 2; i++) {
                if (sayi7 % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi7 + "asal sayi");
        } else {
            System.out.println(sayi7 + "asal sayı değil");
        }


    }}

