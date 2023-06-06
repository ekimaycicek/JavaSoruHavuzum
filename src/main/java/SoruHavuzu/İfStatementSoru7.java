package SoruHavuzu;

import java.util.Scanner;

public class İfStatementSoru7 {

    public static void main(String[] args) {
        /*task- kullanıcının ehliyetinin varlığınıı kontrol ediniz
        ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldığı mesafe 100000km
        ve üzeeri ise kontak anahtarını veriniz aksi durumda tecrübe yılı ve mesafe
        eksiklerini print eden kod create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise E yoksa H giriniz : ");
        char ehlyt = sc.next().charAt(0);

        if (ehlyt == 'E') { //EHLYT VARLIĞI KONTROL EDİLDİ
            System.out.println("kaç yıllık tecrübeniz var: ");
            int tcrb = sc.nextInt();//TCRBE KONTROL EDİLDİ
            if (tcrb >= 7) {


                System.out.println("km giriniz: ");
                int km = sc.nextInt();
                if (km >= 100000) { // KM KONTROLÜ YAPILDI
                    System.out.println("kontak anahatarını alınız");
                }else System.out.println("kontak anahtarı almanız için önce " + (100000-km) + "ihtiyacınız var");

            }else System.out.println("kontak anahtarı almanız için önce " + (7 -  tcrb) + "yıla ihtiyacınız var");


        }

        else if (ehlyt == 'H') {// EHLYT YOKLUĞU KONTROL EDİLDİ
            System.out.println("kursa gidiniz");
        } else System.out.println("hatalı giriş");
    }

}
