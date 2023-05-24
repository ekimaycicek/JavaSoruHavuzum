import java.util.Scanner;

public class StringManipulationSoru2 {

    public static void main(String[] args) {

/*  TASK :
				StringMethods:
				girilen  bir stringin ilk yarisini print eden kdou yaziniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */


        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz: ");
        String cümle=sc.nextLine();
        System.out.println(cümle.substring(0, 4));


    }
    }

