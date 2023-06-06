package ArraysSorular;

import java.util.Scanner;

public class Arrays25 {


    public static void main(String[] args) {


        /* TASK :
 Kullanicidan aldigimiz 8 elemanli arrayin icinde
3 e bölünebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
 */



        int[] array = new int[8];
        Scanner input = new Scanner(System.in);

        System.out.println("agam 8 eleman gir");
        for (int i = 0; i < 8; i++) {
            array[i] = input.nextInt();
        }

        int a = 0;
        for (int i = 0; i < 8; i++) {
            if (array[i] % 3 == 0) {
                a++;
            }
        }

        System.out.println("Dizideki 3 e bölünen sayı adedi:" + a);
    }
}
