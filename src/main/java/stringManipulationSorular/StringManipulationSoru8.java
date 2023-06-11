package stringManipulationSorular;

import java.util.Scanner;

public class StringManipulationSoru8 {
    public static void main(String[] args) {

        //task - girilen 4 harfli kelimeyi tersten yazdırınız

        Scanner sc=new Scanner(System.in);
        System.out.print("kelime giriniz");
        String kelime=sc.next();

        if(kelime.length()!=4){
            System.out.println("yanlış giriş");
        } else {

            System.out.print(kelime.substring(kelime.length() - 1));
            System.out.print(kelime.substring(2, 3));
            System.out.print(kelime.substring(1, 2));
            System.out.print(kelime.substring(0, 1));

        }}
}
