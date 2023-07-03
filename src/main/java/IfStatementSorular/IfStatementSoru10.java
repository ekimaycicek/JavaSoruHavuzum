package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru10 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz: ");
        int yas=sc.nextInt();
        System.out.println("kilonuzu giriniz: ");
        int kilo=sc.nextInt();

        if (yas<18) {
            System.out.println("bağıs yapamaz");
        }

        else if (yas>18) {
            if (kilo < 50) {
                System.out.println("bağıs yapamaz");
            }


            if (yas > 18)
                if (kilo > 50) {
                    System.out.println("kanınız bize helaldir");
                }


        }



    }
}
