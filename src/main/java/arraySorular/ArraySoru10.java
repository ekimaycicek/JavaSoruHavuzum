package ArraysSorular;

public class Arrays10 {

    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.
         */

        String str="Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.";

        String arr[]=str.replace(" ", "").split("");

        System.out.println("arr.length = " + arr.length);


    }
}
