import java.util.Scanner;

public class StringManipulationSoru20 {

    public static void main(String[] args) {


        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz: ");
        String k=sc.nextLine();
        boolean xyzIceriyorMu=false;

        if(k.contains("xyz")){
            xyzIceriyorMu=true;
            System.out.println(xyzIceriyorMu);

        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }
    }
}
