package replitSorular;

import java.util.Scanner;

public class ForLoopSoru7 {

    /*
    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.


Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
     */


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int number = scanner.nextInt();

            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }



            if (sum == number) {
                System.out.println(number + " Mükemmel Sayıdır.");
            } else {
                System.out.println(number + " Mükemmel Sayı değildir.");
            }
        }
    }

