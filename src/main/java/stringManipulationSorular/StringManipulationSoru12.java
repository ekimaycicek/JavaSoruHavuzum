package stringManipulationSorular;

import java.util.Scanner;

public class StringManipulationSoru12 {

    public static void main(String[] args) {

        /*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden kodu yaziniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cift uzunlukta bir str giriniz :");
        String str=scan.nextLine();
        if (str.length()%2==0) {
            System.out.println("strnin ilkyarisi:" +str.substring(0,str.length()/2));
        } else {
            System.out.println("Lutfen cift uzunlukta  str giriniz :");
        }

    }
}
