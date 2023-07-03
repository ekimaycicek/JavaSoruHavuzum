package replitsorular;

import java.util.Scanner;

public class ForLoopSoru9 {

    /*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


Input  :1238

Output :Girilen Numananin Tersi: 8321
     */




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            int tersSayi = tersSayi(sayi);
            System.out.println("Girilen Sayının Tersi: " + tersSayi);
        }

        public static int tersSayi(int number) {
            int tersSayi = 0;

            while (number != 0) {
                int aa = number % 10;
                tersSayi = tersSayi * 10 + aa;
                number /= 10;
            }

            return tersSayi;
        }



    }

