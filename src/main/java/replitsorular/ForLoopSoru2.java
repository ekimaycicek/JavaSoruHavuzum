package replitsorular;

import java.util.Scanner;

public class ForLoopSoru2 {

    /*
    Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

	Beklenen Cikti:

30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci tamsayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci tamsayıyı girin: ");
        int num2 = scanner.nextInt();


        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println(num1 + " ve " + num2 + " için GCD = " + gcd);
        System.out.println(num1 + " ve " + num2 + " için LCM = " + lcm);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }
}
