package String;

import java.util.Scanner;

public class indexof_lastindexof {

    public static void main(String[] args) {

       /* indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false

        */

        String str= "Good";

        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('d'));
        // trick-- olamayan karakter indexi sorgularsa -1 return eder

        System.out.println(str.indexOf("od"));
        System.out.println(str.indexOf("Od"));// -1 verir

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim="ahmet aycicek";

        System.out.println(isim.lastIndexOf('a'));
        System.out.println(isim.lastIndexOf("yc"));
         /*
        task
         Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz

         1-Girilen cumle java icermiyor
         2-Girilen cumle 1 tane java iceriyor
         3-Girilen cumlede birden fazla java var
         */


        Scanner sc = new Scanner(System.in);
        System.out.print("cümle giriniz ");

        String a= sc.nextLine();

        if(a.indexOf("java")==-1){

            System.out.println("girilen cümlede java yok");

        }else if (a.indexOf("java")==a.lastIndexOf("java")){

            System.out.println("1 tane java var");

        }else System.out.println("birden fazla var");


    }
}
