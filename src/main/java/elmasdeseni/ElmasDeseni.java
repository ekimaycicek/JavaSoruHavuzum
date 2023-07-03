package elmasdeseni;

import java.util.Scanner;

public class ElmasDeseni {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.print("bir sayı girin: ");
            int sayi =input.nextInt();

            for (int i = 1; i <= sayi; i++) {
                for (int j = 1; j <= sayi - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = sayi - 1; i >= 1; i--) {
                for (int j = 1; j <= sayi - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        input.close();
    }
}