package stringmanipulationsorular;

import java.util.Scanner;

public class StringManipulationSoru18 {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String word1= sc.nextLine();
        String word2= sc.nextLine();
        String word3= sc.nextLine();
        String word4= sc.nextLine();
        System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1) + " " + word2 + " " + word3 + " " + word4 + ".");
    }
}
