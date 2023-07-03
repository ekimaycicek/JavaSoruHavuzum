package stringmanipulationsorular;

import java.util.Scanner;

public class StringManipulationSoru1 {

    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin farkli olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("isim giriniz: ");
        String isim=sc.nextLine();

        System.out.println((isim.length() > 3 ? ("isim 3 harfli olmalı")  : (isim.charAt(0) == isim.charAt(1) || isim.charAt(2) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)) ? "girilen karakterler aynıdır" : "tberikler"));


    }
}
