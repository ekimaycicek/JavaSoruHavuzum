package karsilastirmaOperatoruSorular;

import java.util.Scanner;

public class KarsilastirmaOperatoruSoru5 {


    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        // Scanner dp = new Scanner(System.in);

        // double num1 = dp.nextDouble();
        // double num2 = dp.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner dp = new Scanner(System.in);
        System.out.println("num1 giriniz" + "num2 giriniz");

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();

        System.out.println(num1==num2);
    }
}
