import java.util.Scanner;

public class İfSoru1 {

    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("lutfen Y/N iklisinden birini giriniz : ");

        char krktr = scan.next().charAt(0);

        if (krktr == 'y' || krktr == 'Y') {

            System.out.println("yes");

        } else if (krktr == 'N' || krktr == 'n') {

            System.out.println("no");

        } else System.out.println("hatalı giriş");


    }
}

