package SoruHavuzu;

import java.util.Scanner;

public class İfStatementSoru3 {

    public static void main(String[] args) {
        /*
       girilen bir yılın artık(leap year) olmasını kontrol eden code create ediniz
       artık yıl:

       kural1: 4 ile bölünemeyen yıllar artık yıl değildir
       kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
       kural3: 4 ün katı olmasına rağmen 100 ile bölünebilen yıllardan
       sadece 400 ün katı olan yıllar artık yıldır
         */


        Scanner sc=new Scanner(System.in);

        System.out.println("yıl giriniz");

        int yıl= sc.nextInt();

        if ((yıl%4==0) && (yıl%100!=0) || (yıl%400==0) ) {
            System.out.println("artık yıl");

        }
        else System.out.println("artık yıl değil");

    }
}
