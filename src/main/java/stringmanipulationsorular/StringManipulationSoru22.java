package stringmanipulationsorular;

import java.util.Scanner;

public class StringManipulationSoru22 {

    public static void main(String[] args) {

        /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz: ");
        String kelime=sc.nextLine();
        if (kelime.length()%2!=0 && kelime.length() >=3){

            System.out.println(kelime.charAt((kelime.length() -1)/ 2));
        }else System.out.println("geçersiz giriş");
    }
}
