package stringmanipulationsorular;

import java.util.Scanner;

public class StringManipulationSoru14 {

    public static void main(String[] args) {

         /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */



        Scanner sc=new Scanner(System.in);
        System.out.println("ad soyad giriniz: ");
        String a=sc.nextLine();

        String ad=a.substring(0,a.indexOf(" "));
        String soyad= a.substring(a.indexOf(" "), a.length());

        System.out.println("ad: " + ad + "\nsoyad: " + soyad );

    }
}
