package switchsorular;

import java.util.Scanner;

public class SwitchSoru1 {


    public static void main(String[] args) {



        //kullanıcının girdiği rakamı yazı ile print eden kodu yazınız

        Scanner sc=new Scanner(System.in);
        System.out.println("rakam giriniz: ");
        int rakam=sc.nextInt();

        switch (rakam){
            case 0:
                System.out.println("girilen rakam SIFIR");
                break;
            case 1:
                System.out.println( "girilen rakam BİR");
                break;
            case 2:
                System.out.println("girilen rakam İKİ");
                break;
            case 3:
                System.out.println("girilen rakam ÜÇ");
                break;
            case 4:
                System.out.println("girilen rakam DÖRT");
                break;
            case 5:
                System.out.println("girilen rakam beş");
                break;

            case 6:
                System.out.println("girilen rakam altı");
                break;

            case 7:
                System.out.println("girilen rakam yedi");
                break;
            case 8:
                System.out.println("girilen rakam sekiz");
                break;
            case 9:
                System.out.println("girilen rakam dokuz");
                break;







            default:
                System.out.println("yanlış giriş");
        }


    }
}

/*

Bu kod parçası, kullanıcıdan bir rakam girmesini isteyen ve girilen rakama göre bir çıktı veren bir programı temsil ediyor.

İlk olarak, Scanner sınıfından sc adında bir nesne oluşturuluyor. Bu nesne, kullanıcıdan girdi almak için
 kullanılacak olan System.in (standart giriş) nesnesini kullanıyor.

Daha sonra, kullanıcıya "rakam giriniz: " şeklinde bir mesaj gösteriliyor.

nextInt() metodu kullanılarak kullanıcının girdiği değer rakam değişkenine atılıyor.

switch ifadesi, rakam değişkeninin değerine bağlı olarak farklı durumları kontrol ediyor.
 Her bir durumda, girilen rakama karşılık gelen bir çıktı yazdırılıyor.

Örneğin, eğer rakam 0 ise, "girilen rakam SIFIR" yazdırılıyor. Eğer rakam 1 ise, "girilen rakam BİR" yazdırılıyor.
Bu şekilde, 0 ile 9 arasındaki rakamlar için uygun çıktılar yazdırılıyor.

default ifadesi ise, rakam değişkeninin hiçbir durumla eşleşmediği durumlarda çalışır. Bu durumda,
"yanlış giriş" yazdırılır.

Kodun sonunda, } işareti ile bir süslü parantez bulunuyor, bu da switch ifadesinin sonunu gösteriyor.

Bu kod parçası, kullanıcının girdiği rakama bağlı olarak farklı işlemler yapabilen bir programı temsil eder.
 Örneğin, kullanıcının girdiği rakama göre bir ifadeyi çalıştırabilir, belirli bir durumu kontrol edebilir
 veya belirli bir işlemi gerçekleştirebilirsiniz.
 */
