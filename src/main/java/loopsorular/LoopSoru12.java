package loopsorular;

import java.util.Scanner;

public class LoopSoru12 {

    public static void main(String[] args) {


         /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;//Bu değişken, toplamı hesaplamak için kullanılacak.

        for (int i = 1; i < sayi; i++) {

            //öngü bloğunda, her i değeri için toplam değişkeni güncellenir. Her bir
            // i değeri için (i * i) ifadesi kullanılarak i'nin karesi elde edilir
            // ve bu değer toplam değişkenine eklenir: toplam = (i * i) + toplam;
            toplam = (i * i) + toplam;

        }
        System.out.println("Sayıların kareleri toplamı: " + toplam);

    }
}
