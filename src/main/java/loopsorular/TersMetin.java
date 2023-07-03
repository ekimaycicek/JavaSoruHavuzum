package loopsorular;

import java.util.Scanner;

public class TersMetin {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.print("Bir metin girin: ");
    String metin = scanner.nextLine();

    StringBuilder tersMetin = new StringBuilder();
    StringBuilder kelime = new StringBuilder();

    for (int i = 0; i < metin.length(); i++) {
        if (metin.charAt(i) == ' ' || i == metin.length() - 1) {
            if (i == metin.length() - 1) {
                kelime.append(metin.charAt(i));
            }
            for (int j = kelime.length() - 1; j >= 0; j--) {
                tersMetin.append(kelime.charAt(j));
            }
            tersMetin.append(" ");
            kelime.setLength(0);
        } else {
            kelime.append(metin.charAt(i));
        }
    }

    tersMetin.deleteCharAt(tersMetin.length() - 1);

    System.out.println("Metnin ters hali: " + tersMetin.toString());
}    }