package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /* task- girilen karakterin harf olup olmadığını kontrol eden code creeate ediniz

         */

        System.out.println("karakter giriniz: ");


        //kullanıcıdan bir giriş alınır ve bu girişin ilk karakteri ch değişkenine atanır.
        char ch=sc.nextLine().charAt(0);

        //girilen karakterin büyük harf aralığında (A ile Z arasında) olup olmadığını kontrol eder.
        if ((ch>='A' && ch<='Z' ) || (ch>='a' && ch<='z')) {

            System.out.println("ch harftir");
        }
        else System.out.println("karakter harf değildir");




    }
}
