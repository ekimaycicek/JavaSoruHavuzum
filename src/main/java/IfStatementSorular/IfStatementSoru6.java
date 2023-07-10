package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru6 {

    public static void main(String[] args) {
      /*
      task- kullanıcının cinsiyeti kadın ise 60 yasından
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
                int primGunu = sc.nextInt();
                if (primGunu > 6000) {
                    System.out.println("tebrikler emekli oldunuz");
                } else System.out.println("emeklilik için: " + (6000 - primGunu) + "yatırmanız lazım");
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




        /*
        İlk olarak Scanner sınıfı kullanılarak bir giriş yapılması için sc nesnesi oluşturulur.

Daha sonra kullanıcıya cinsiyetini seçmesi istenir: System.out.println("cinsiyetiniz \n kadın için: k\n erkek için: e\n giriniz"); Bu ifadeyle kullanıcıya 'k' veya 'e' karakterlerinden birini girmesi istenir ve girilen değer cnsyt değişkenine atanır.

Sonraki adımda kullanıcıdan yaşını girmesi istenir: System.out.println("yasınızı giriniz"); Bu ifadeyle kullanıcıya yaşını girmesi istenir ve girilen değer yas değişkenine atanır.

Kod, girilen cinsiyet ve yaşa göre farklı koşulları kontrol eder:

Eğer cinsiyet 'k' ise, içinde bulunan bloğa girer.

Eğer yaş 60'tan büyük ise, içinde bulunan bir başka bloğa girer.
Kullanıcıdan prim gününü girmesi istenir: System.out.println("prim gününü giriniz"); Bu ifadeyle kullanıcıdan prim gününü girmesi istenir ve girilen değer primgunu değişkenine atanır.
Eğer girilen prim günü 6000'den büyük ise, "tebrikler emekli oldunuz" mesajı ekrana yazdırılır.
Eğer girilen prim günü 6000'den küçük ise, "emeklilik için: (6000 - primgunu) yatırmanız lazım" mesajı ekrana yazdırılır.
Eğer yaş 60'tan küçük ise, "emekliliğinize daha: (60 - yas) yıl daha var" mesajı ekrana yazdırılır.
Eğer cinsiyet 'e' ise, içinde bulunan bloğa girer.

Eğer yaş 65'ten büyük ise, içinde bulunan bir başka bloğa girer.
Kullanıcıdan prim gününü girmesi istenir: System.out.println("prim gününü giriniz"); Bu ifadeyle kullanıcıdan prim gününü girmesi istenir ve girilen değer primgunu değişkenine atanır.
Eğer girilen prim günü 7000'den büyük ise, "tebrikler emekli oldunuz" mesajı ekrana yazdırılır.
Eğer girilen prim günü 7000'den küçük ise, "emeklilik için: (7000 - primgunu) yatırmanız lazım" mesajı ekrana yazdırılır.
Eğer yaş 65'ten küçük ise, "emekliliğinize daha: (65 - yas) yıl daha var" mesajı ekrana yazdırılır.
Eğer girilen cinsiyet 'k' veya 'e' değilse, "cinsyt gir emekli ol" mesajı ekrana yazdırılır.
         */
    }
}
