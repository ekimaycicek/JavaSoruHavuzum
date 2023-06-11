package ifStatementSorular;

import java.util.Scanner;

public class IfStatementSoru8 {

    public static void main(String[] args) {
        /* kullanıcıdan bir sayı alın
        Eğer 10 dan büyük ise "büyüksün" yazdırın
        eğer 10 dan küçük ise "normalsin yazdırın


      eğer sayı pozitif değilse -10 dan büyük olup olmadığını kontrol edin
      eğer -10 dan büyük ise negatifsin yazdırın
      eğer -10 dan kucuk ise çok negatifsin yazdırın
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();

        if (sayı > 0) {
            if (sayı > 10) {
                System.out.println("büyüksün");
            } else System.out.println("normalsin");
        }




        else if (sayı < 0) {
            if (sayı > (-10)) {
                System.out.println("negatifsin");
            } else System.out.println("çok negatifsin");


        }
    }
}
