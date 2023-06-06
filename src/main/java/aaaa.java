import java.util.Scanner;

public class aaaa {

    public static void main(String[] args) {


            Scanner sss = new Scanner(System.in);
            System.out.println("sayi gir ");
            int sayi = sss.nextInt();

            for (int i = 1; i <= sayi; i++) {

                for (int j = 1; j <= sayi ; j++) {

                    System.out.print(i * j+ "\t" );
                }
                System.out.println();
            }

        }
    }

