package SoruHavuzu;

import java.util.Scanner;

public class İfStatementSoru2 {

    public static void main(String[] args) {
        /* kullanıcıdan 100 üerinden notunu isteyin
        notu harf sistemine çevirip yazdırın
        50 den küçük ise D
        50 - 60 arası C
        60 - 70 arası B
        80 üzerindeyse A
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = sc.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("düzgün sayı gir");

        } else if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");

        } else if (not < 80) {
            System.out.println("B");

        } else {

            System.out.println("A");

        }
    }
}
