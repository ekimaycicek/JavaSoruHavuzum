package replitsorular;

import java.util.Scanner;

public class ForLoopSoru4 {

/*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=6*5*4*3*2*1=720

 */




        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir tamsayı girin: ");
            int number = scanner.nextInt();

            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.print(number + "! = ");

            for (int i = number; i >= 1; i--) {
                System.out.print(i);
                if (i != 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + factorial);
        }
    }


