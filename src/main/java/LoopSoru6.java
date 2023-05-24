import java.util.Scanner;

public class LoopSoru6 {

    public static void main(String[] args) {

        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false

         * */


        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();
        System.out.println(getAsalMı(sayı));

    }

    private static boolean getAsalMı(int sayı) {

        boolean asalmı = true;
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                asalmı=false;


            }
        }
        return asalmı;
    }

}

