package ifStatementSorular;

import java.util.Scanner;

public class IfStatementSoru9 {


    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("boyunuzu giriniz: ");
        double boy= sc.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo= sc.nextDouble();
        double bmi= kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("oldukca zayıfsınız");
        }
        else if ((20 < bmi) && (bmi<=25)){
            System.out.println("normalsiniz");
        }

        else if ((25<bmi) && (bmi<30)){
            System.out.println("şişmansınız");
        }

        else System.out.println("obezsiniz");



    }

}
