package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru5 {


    public static void main(String[] args) {
        /*
        task- girilen 2 sayıyı seçilen 4 işlem birini
        uygulayıp sonucu print eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");

        double sayi1= sc.nextDouble();

        System.out.println("2. sayıyı giriniz: ");

        double sayi2= sc.nextDouble();

        System.out.println("+ icin: 1 seciniz \n* icin: 2 seciniz, \n- icin: 3 seciniz, \n/ icin: 4 seciniz");

        int secim= sc.nextInt();

        if(secim==1){
            System.out.println("toplama sonucu: " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        }
        else if(secim==2){
            System.out.println("toplama sonucu: " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        }
        else if(secim==3){
            System.out.println("toplama sonucu: " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        }
        else if(secim==4){
            System.out.println("toplama sonucu: " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
        }
        else System.out.println("düzzgün sayı gir");







    }
}
