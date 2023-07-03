package dowhilesorular;

import java.util.Scanner;

public class DoWhileSoru1 {

    public static void main(String[] args) {

        // task-> girilen  5 sayının  en büyüğünü print den kodu yazınız

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int max = 0;

        while (a < 5) {
            System.out.println("5 adet sayı giriniz ");
            int sayı = sc.nextInt();

            a++;
            max=Math.max(max,sayı);




        }
        System.out.println("max = " + max);

    }
}
