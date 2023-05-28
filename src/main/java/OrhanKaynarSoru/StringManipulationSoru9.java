package OrhanKaynarSoru;

import java.util.Scanner;

public class StringManipulationSoru9 {

    public static void main(String[] args) {

         /*
        Girilen String'in son karakterini silen kodu yaziniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println(str.substring(0, str.length() - 1));

    }
}
