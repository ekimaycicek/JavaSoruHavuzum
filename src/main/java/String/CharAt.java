package String;
import java.util.Scanner;
public class CharAt {

    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */

        String sehir="Istanbul";
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));
        char besinciindexkrktr = sehir.charAt(5);
        System.out.println(besinciindexkrktr);

        //son index karakteri --> length()-1

        sehir.charAt(sehir.length()-1);
        System.out.println(sehir.charAt(sehir.length() - 1));

        //ilk index karakter --> charAt(0)

        sehir.charAt(0);
        System.out.println(sehir.charAt(0));



        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...

        Scanner sc=new Scanner(System.in);

        System.out.println("kelime giriniz: ");
        String kelime=sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");



    }
}
