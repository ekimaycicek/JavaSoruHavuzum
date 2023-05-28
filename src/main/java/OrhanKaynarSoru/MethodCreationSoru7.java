package OrhanKaynarSoru;

import java.util.Scanner;

public class MethodCreationSoru7 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("yıl giriniz: ");
        int yıl = sc.nextInt();


        System.out.println(artıkYıl(yıl));
    }

    public static boolean artıkYıl(int yl) {

        if (yl % 4 == 0) {

            return true;

        } else
            return false;
    }
}
