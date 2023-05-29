package çözüleceksorular;

import java.util.Scanner;

public class İfStatementSoru10 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz: ");
        int yas=sc.nextInt(); //Kullanıcıya "yaşınızı giriniz: " mesajı ekrana yazdırılır ve girilen değer yas değişkenine atılır.

        System.out.println("kilonuzu giriniz: ");
        int kilo=sc.nextInt();


        //Daha sonra, yaşa göre bir kontrol yapılır. İlk if bloğu, yaşın 18'den küçük olduğunu kontrol eder.
        //Eğer bu koşul sağlanıyorsa, "bağış yapamaz" mesajı ekrana yazdırılır.
        if (yas<18) {
            System.out.println("bağıs yapamaz");
        }

        //Eğer yaş 18'den küçük değilse, bir sonraki else if bloğuna geçilir. Bu blok, yaşın 18'den büyük
        // olduğunu kontrol eder. İç içe geçmiş iki if bloğu daha bulunur. İlk iç if bloğu, kilonun 50'den küçük olduğunu
        //  kontrol eder. Eğer bu koşul sağlanıyorsa, yine "bağış yapamaz" mesajı ekrana yazdırılır.
        if (yas>18) {
            if (kilo < 50) {
                System.out.println("bağıs yapamaz");
            }


            //Eğer bu koşul da sağlanmıyorsa, ikinci iç if bloğu devreye girer. Bu blok, yaşın 18'den büyük ve kilonun
            //50'den büyük olduğunu kontrol eder. Eğer bu koşul sağlanıyorsa, "kanınız bize helaldir" mesajı ekrana yazdırılır.
            if (yas > 18 && kilo>50)

                    System.out.println("kanınız bize helaldir");
                }


        }



    }


