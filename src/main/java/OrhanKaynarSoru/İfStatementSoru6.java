package OrhanKaynarSoru;

import java.util.Scanner;

public class İfStatementSoru6 {

    public static void main(String[] args) {
      /*
      task- kullanıcının cinsiyeti kaddın ise 60 yasında
      büyük ve prim günü 6000den fazla ise emekliliği
      kullanıcı erkek ise 65 yasından büyük ve prim günü 7000den
      fazla ise emekliliğini kontrol edip kalan yıl ve prim
      gününü print eden code create ediniz
       */

        Scanner sc = new Scanner(System.in);
        System.out.println("cinsiyetiniz \n kadın için: k\n erkek için: e\n giriniz");
        char cnsyt = sc.next().charAt(0);

        System.out.println("yasınızı giriniz");
        int yas = sc.nextInt();

        if (cnsyt == 'k') {

            if (yas > 60) {
                System.out.println("prim gününü giriniz");
                int primgunu = sc.nextInt();
                if (primgunu > 6000) {
                    System.out.println("tebrikler emekli oldunuz");
                } else System.out.println("emeklilik için: " + (6000 - primgunu) + "yatırmanız lazım");
            } else System.out.println("emekliliğinize daha: " + (60 - yas) + "yıl daha var");


        } else if (cnsyt == 'e') {
            if (yas > 65) {
                System.out.println("prim gününü giriniz");
                int primgunu = sc.nextInt();
                if (primgunu > 7000) {
                    System.out.println("tebrikler emekli oldunuz");
                } else System.out.println("emeklilik için: " + (7000 - primgunu) + "yatırmanız lazım");
            } else System.out.println("emekliliğinize daha: " + (65 - yas) + "yıl daha var");

        } else System.out.println("cinsyt gir emekli ol");


    }
}
