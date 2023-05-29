package çözüleceksorular;

import java.util.Scanner;

public class İfStatementSoru8 {

    public static void main(String[] args) {


        /* kullanıcıdan bir sayı alın
        Eğer 10 dan büyük ise "büyüksün" yazdırın
        eğer 10 dan küçük ise "normalsin yazdırın


       eğer sayı pozitif değilse -10 dan büyük olup olmadığını kontrol edin
       eğer -10 dan büyük ise negatifsin yazdırın
      eğer -10 dan kucuk ise çok negatifsin yazdırın
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");// Ardından kullanıcıya "sayı giriniz: " mesajı ekrana yazdırılır.

        int sayı = sc.nextInt();// Girilen sayı nextInt() yöntemiyle sayı değişkenine atılır.


        if (sayı > 0) { //Daha sonra, girilen sayı pozitif mi diye kontrol edilir.
            if (sayı > 10) {// Eğer sayı pozitif ise, iç içe if bloğu çalışır.
                System.out.println("büyüksün");
            } else System.out.println("normalsin");
        }
    //İlk iç if bloğu, sayının 10'dan büyük olup olmadığını kontrol eder.


    //Eğer girilen sayı pozitif değilse, else if bloğuna geçilir ve sayının negatif olup olmadığı kontrol edilir.
         if (sayı < 0) {
            if (sayı > (-10)) {
                System.out.println("negatifsin");
            } else System.out.println("çok negatifsin");


        }
    }
}


