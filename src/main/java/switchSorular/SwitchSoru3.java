package switchSorular;

import java.util.Scanner;

public class SwitchSoru3 {

    public static void main(String[] args) {


        //girilen ay numarasına göre kaç gün çektiğini print eden kodu yaziniz


        Scanner sc=new Scanner(System.in);
        System.out.println("ay numarasi girin");
        int ay=sc.nextInt(); //Daha sonra int ay = sc.nextInt(); ifadesiyle kullanıcıdan bir tamsayı değeri okunuyor ve ay değişkenine atanıyor.


//switch ifadesi kullanılarak ay değişkeni kontrol ediliyor. Eğer ay değeri
// 1, 3, 5, 7, 8, 10 veya 12 ise case ifadelerinin altındaki kod
// bloğu çalışacak ve "girilen ay 31 gün içerir" mesajı ekrana
// yazdırılacak.
        switch (ay){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
                break;
//Eğer ay değeri 4, 6, 9 veya 11 ise case ifadelerinin altındaki kod
// bloğu çalışacak ve "girilen ay 30 gün içerir" mesajı ekrana
// yazdırılacak.
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
//Eğer ay değeri 2 ise, kullanıcıdan bir yıl değeri (yıl) okunuyor
// ve if ifadesiyle yılın 4'e bölümünden kalanının 0 olup olmadığı
// kontrol ediliyor.
            case 2:
                System.out.println("yılınızı giriniz");
                int yıl= sc.nextInt();
                if (yıl%4==0){
                    System.out.println("girilen ay 29 gün içerir");

                }else System.out.println("girilen ay 28 gün içerir");
                break;



//int kullanılarak ay ve yıl gibi değişkenlerin tamsayı değerlerini
// tutması sağlanmıştır. Çünkü kullanıcının gireceği ay ve yıl değerleri
// tam sayı olarak temsil edilir.
//
//Java'da int veri türü, tam sayı değerlerini temsil etmek
// için kullanılır.
// Bu nedenle ay ve yıl değişkenleri için int kullanılmıştır.
//
//Örneğin, ay değeri olarak 1, 2, 3 gibi tam sayılar alınabilirken,
// ondalıklı sayılar veya diğer veri türleri bu durumda uygun
// olmayabilir. Bu yüzden int tercih edilmiştir.











            default:
                System.out.println("yanlış giriş");

        }
    }
}
