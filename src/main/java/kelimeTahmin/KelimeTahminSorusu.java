package KelimeTahmin;

import java.util.Scanner;

public class KelimeTahminSorusu {

    public static void main(String[] args) {
        String kelime = "Ekoloji";
        int i, tahmin = 0, anahtar = 0, dogru = 0;
        String harfler[] = new String[kelime.length()];

        System.out.println("Kelimeyi bulmak için 5 yanlış hakkın var agam.");
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < kelime.length(); i++) {
            harfler[i] = "_ ";
        }

        bitis:
        while (tahmin < 6) {
            System.out.println("Bir harf giriniz (Kalan hakkiniz " + (5 - tahmin) + ") : ");
            String harf = scanner.nextLine();
            tahmin++;
            for (i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == harf.charAt(0)) {
                    harfler[i] = harf + " ";
                    anahtar = 1;
                    dogru++;
                    if (dogru == kelime.length()) {
                        System.out.println("kelime " + kelime + "...Tebrikler canim...");
                        break bitis;
                    }
                }
            }
            if (anahtar == 1) {
                anahtar = 0;
                tahmin--;
            }
            for (i = 0; i < kelime.length(); i++) {
                System.out.print(harfler[i]);
            }
            System.out.println();
        }
        if (dogru != kelime.length()) {
            System.out.println("Üzgünüm agam... Doğru yanıt " + kelime);
        }
    }}
