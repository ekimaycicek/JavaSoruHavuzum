import java.util.Scanner;

public class StringManipulationSoru24 {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


        Scanner sc=new Scanner(System.in);

        System.out.println("ad giriniz: ");
        String ad=sc.nextLine();
        System.out.println("soyad giriniz: ");
        String soyad=sc.nextLine();

        if (ad.length()>soyad.length()){
            System.out.println("adınız daha uzun ");
        }else System.out.println("soyadınız daha uzun");

    }
}
