package stringManipulationSorular;

import java.util.Scanner;

public class StringManipulationSoru19 {

    public static void main(String[] args) {

        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem

		 */


        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz: ");
        String s=sc.next().toLowerCase();
        if (s.startsWith("gh")){
            System.out.println(s);
        } else if (s.startsWith("g")) {
            System.out.println(s.charAt(0) + s.substring(2));

        }else if (s.charAt(1)=='h'){
            System.out.println(s.substring(1));
        }else System.out.println(s.substring(2));


    }
}
