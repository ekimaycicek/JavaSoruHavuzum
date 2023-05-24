import java.util.Scanner;

public class StringManipulationSoru17 {

    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("kelime1 gitiniz \nkelime2 giriniz ");
        String kelime1=sc.nextLine();
        String kelime2=sc.nextLine();
        System.out.println(kelime1.concat(kelime2));
        System.out.println(kelime1.substring(1).concat(kelime2.substring(1)));
    }
}
