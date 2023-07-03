package replitsorular;

import java.util.Scanner;

public class ForLoopSoru1 {

     /*

Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir isim girin: ");
        String name = scanner.nextLine();

        System.out.print("Bir karakter girin: ");

        char ch1 = scanner.nextLine().charAt(0);
        int sayac = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch1) {
                sayac++;
            }
        }

        System.out.println(" Number of " + ch1 + " = " + sayac);

}}
