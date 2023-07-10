package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru7 {

    public static void main(String[] args) {
        /*task- kullanıcının ehliyetinin varlığınıı kontrol ediniz
        ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldığı mesafe 100000km
        ve üzeeri ise kontak anahtarını veriniz aksi durumda tecrübe yılı ve mesafe
        eksiklerini print eden kod create ediniz
         */



        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise E yoksa H giriniz : ");
        char ehlyt = sc.next().charAt(0);

        if (ehlyt == 'E') {
            System.out.println("kaç yıllık tecrübeniz var: ");
            int tcrb = sc.nextInt();
            if (tcrb >= 7) {


                System.out.println("km giriniz: ");
                int km = sc.nextInt();
                if (km >= 100000) {
                    System.out.println("kontak anahatarını alınız");

                    //Eğer km değeri 100000'den küçük ise, "kontak anahtarı almanız için önce (100000 - km)
                    // ihtiyacınız var" mesajı ekrana yazdırılır.
                }else System.out.println("kontak anahtarı almanız için önce " + (100000-km) + "ihtiyacınız var");

                //Eğer tcrb değeri 7'den küçük ise, "kontak anahtarı almanız için önce (7 - tcrb) yıla ihtiyacınız
                // var" mesajı ekrana yazdırılır.
            }else System.out.println("kontak anahtarı almanız için önce " + (7 -  tcrb) + "yıla ihtiyacınız var");


        }

        else if (ehlyt == 'H') {
            System.out.println("kursa gidiniz");
        } else System.out.println("hatalı giriş");


    }

}
