package ifstatementsorular;

import java.util.Scanner;

public class NestedIfSoru1 {


    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("yas giriniz: ");

        int yas = sc.nextInt();

        if (yas >= 18) {

            System.out.println("oy kullanmmaya uygun");


            if (yas >= 70) {
                System.out.println("uc kez oy kullanabilir");
            }

            else if (70 > yas && yas >= 50) {


                System.out.println("2 kez oy kullanabilit");


            }
            else if (50 > yas && yas >= 18) {

                System.out.println("1 kez oy kullanabilir");

            }

        }else System.out.println("hatalı giriş");
    }
}
