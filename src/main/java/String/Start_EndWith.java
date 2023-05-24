package String;

import java.util.Scanner;

public class Start_EndWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String sehir= "istanul";

        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("ist"));//true
        System.out.println(sehir.startsWith("bal"));//false
        System.out.println(sehir.startsWith("a", 3));//true 3. indexten itibaren strin a ile mi başlar

        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));
        // int yas= 48;



        // System.out.println(sehir.endsWith(yas));// cte

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("email giriniz: ");

        String email=sc.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("lütfen gmail hesabı giriniz");

        } else if (email.contains("@gmail.com")){
            System.out.println("hesabınız onaylandı");


        }else System.out.println("geçerli hesap giriniz");








    }
}
