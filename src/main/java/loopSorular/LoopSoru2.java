package loopSorular;

import java.util.Scanner;

public class LoopSoru2 {

    public static void main(String[] args) {

        //girilen sayıdan 100e kadar 4 ün katı olan tam sayıları print eden kod yazınız

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı=sc.nextInt();

        if(sayı>100){
            System.out.println("agam düzgün sayı gir");
        }else{
            for (int i = sayı; i <100 ; i++) {
                if (i%4==0){
                    System.out.println(i+" ");
                }

            }

        }

        /*
        Bu kod bloğu, kullanıcıdan bir sayı girmesini isteyen ve girilen sayıdan başlayarak 100'e kadar olan sayılar
        arasında 4'e tam bölünen sayıları ekrana yazdıran bir programdır.

İlk olarak, Scanner sınıfı kullanılarak bir Scanner nesnesi oluşturulur ve kullanıcıdan bir sayı girmesi istenir.

Daha sonra, girilen sayı sayı adlı bir int değişkenine atanır.

Şimdi, if bloğu kullanılarak girilen sayının 100'den büyük olup olmadığı kontrol edilir. Eğer sayı 100'den büyükse,
 "agam düzgün sayı gir" şeklinde bir çıktı verilir.

Eğer sayı 100'den küçük veya eşitse, for döngüsü kullanılarak i değişkeni sayı değerinden başlayarak 100'e
 kadar olan sayıları kontrol eder. Döngü, i'nin 100'e kadar olan değerleri için çalışır.

Her bir i değeri için, i'nin 4'e tam bölünüp bölünmediği kontrol edilir. Eğer i 4'e tam bölünüyorsa, i değeri ekrana yazdırılır.

Sonuç olarak, kullanıcının girdiği sayıdan başlayarak 100'e kadar olan sayılar arasında 4'e tam bölünen
 sayılar ekrana yazdırılır. Eğer girilen sayı 100'den büyükse, hata mesajı verilir.
         */
    } }