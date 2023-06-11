package switchSorular;

import java.util.Scanner;

public class SwitchSoru7 {

    public static void main(String[] args) {


        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayı = sc.nextInt();

        //sayi degiskeni üzerinde yapilan islemlerle yüzler basamagi, onlar basamagi ve
        // birler basamagi elde edilir. yüzlerBasamgi degiskenine sayi / 100, onlarBasamagi
        // degiskenine (sayi / 10) % 10 ve birler degiskenine sayi % 10 degerleri atanir.
        int yüzlerBas = sayı / 100, onlarBas = (sayı / 10) % 10, birler = sayı % 10;

        //Ardindan, if ifadesiyle sayinin 99 ile 1000 arasinda olup olmadigi
        // kontrol edilir. Eğer bu kosul saglaniyorsa, yani kullanicinin
        // girdigi sayi 3 basamakli ise, icerideki kod blogu calistirilir.
        // Aksi takdirde hicbir islem yapilmaz ve program sonlanir.

        //İcerideki kod blogunda, switch ifadeleri kullanilarak yüzlerBasamagi, onlarBasamagi
        // ve birler degiskenlerinin degerlerine göre Türkce sayilar ekrana
        // yazdırilir.
        if (sayı > 99 && sayı < 1000) {
            switch (yüzlerBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                    break;
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("beşyüz");
                    break;
                case 6:
                    System.out.println("altıyüz");
                    break;
                case 7:
                    System.out.println("yediyüz");
                    break;
                case 8:
                    System.out.println("sekizyüz");
                    break;
                case 9:
                    System.out.println("dokuzyüz");
                    break;


            }
            switch (onlarBas) {

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }

            switch (birler){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }


        }


    }
}
