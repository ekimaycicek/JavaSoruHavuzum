package scannersorular;

import java.util.Scanner;

public class ScannerSoru7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner sc=new Scanner(System.in);
        System.out.println("Banka Hesabınız var mı:");
        Boolean bankahesabı=sc.nextBoolean();
        System.out.println("bankahesabı = " + bankahesabı);


    }
}
