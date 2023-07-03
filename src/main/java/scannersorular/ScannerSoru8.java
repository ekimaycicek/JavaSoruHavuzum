package scannersorular;

import java.util.Scanner;

public class ScannerSoru8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner sc=new Scanner(System.in);
        System.out.println("Ağırlık:");
        byte ağırlık= sc.nextByte();
        System.out.println("ağırlık = " + ağırlık);




    }
}
