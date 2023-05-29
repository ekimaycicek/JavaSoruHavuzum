package çözüleceksorular;

import java.util.Scanner;

public class NestedİfSoru1 {

    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("yas giriniz: ");

        int yas = sc.nextInt();

        if (yas >= 18) {

            System.out.println("oy kullanmmaya uygun");


            if (yas >= 70) {
                System.out.println("uc kez oy kullanabilir");
            }

            else if (70 > yas && yas >= 50) {


                System.out.println("2 kez oy kullanabilit");


            }
            else if (50 > yas && yas >= 18) {

                System.out.println("1 kez oy kullanabilir");

            }

        }else System.out.println("hatalı giriş");
    }

}

/*
İlk olarak Scanner sınıfı kullanılarak System.in aracılığıyla kullanıcıdan veri girişi alınır.
Kullanıcıya "yaş giriniz: " mesajı ekrana yazdırılır ve girilen değer yas değişkenine atılır.

Daha sonra, yaşa göre bir dizi koşul kontrolü yapılır. İlk if bloğu, yaşın 18 veya daha büyük olduğunu kontrol eder.
Eğer bu koşul sağlanıyorsa, "oy kullanmaya uygun" mesajı ekrana yazdırılır.

Sonrasında, iç içe geçmiş if-else if blokları yer alır. İlk iç if bloğu, yaşın 70 veya daha büyük olduğunu kontrol
eder. Bu koşul sağlanıyorsa, "üç kez oy kullanabilir" mesajı ekrana yazdırılır.

Eğer ilk iç if bloğunun koşulu sağlanmazsa, bir sonraki else if bloğu kontrol edilir. Bu blok, yaşın 70'den küçük
 ve 50 veya daha büyük olduğunu kontrol eder. Bu koşul sağlanıyorsa, "iki kez oy kullanabilir" mesajı ekrana yazdırılır.

Eğer ikinci iç else if bloğunun koşulu sağlanmazsa, son else if bloğu kontrol edilir. Bu blok, yaşın 50'den küçük
ve 18 veya daha büyük olduğunu kontrol eder. Bu koşul sağlanıyorsa, "bir kez oy kullanabilir" mesajı ekrana yazdırılır.

Eğer hiçbir koşul sağlanmıyorsa, son else bloğu çalışır ve "hatalı giriş" mesajı ekrana yazdırılır.

Bu şekilde, kullanıcının girdiği yaş değerine göre bir dizi koşul kontrol edilir ve kullanıcının oy
kullanma durumuna uygun mesajlar ekrana yazdırılır.
 */
