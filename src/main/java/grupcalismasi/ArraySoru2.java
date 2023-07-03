package grupcalismasi;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru2 {

    public static void main(String[] args) {
        //örnek 1: kullanıcının coklu datayı bir array e yerleştirebilmesi, istediği zaman durdurabilmesi için gereken kodu yazınız

        /*
        1.kullanıcıdan data almak için Scanner object oluştur
        2.coklu datayı yerleştirmek için bir array olusturmalıyız
        3.array olusturabilmek için kullanıcıdan array e kac tane eleman koyacagını almalıyız
        4.loop olusturup eleman ekleme işlemini tekrar tekrar yapabilmeliyiz
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen eklemek istediğiniz ögrenci sayısını giriniz");
        int numOfElements=scan.nextInt();

        String stdNames[]= new String[numOfElements];

        System.out.println("işlemi durdurmak için 'q' ya basınız");
        for (int i = 0; i <stdNames.length ; i++) {

            System.out.println((i+1) +  " . öğrencinin ismini giriniz");
            String name=scan.next();
            if (name.equalsIgnoreCase("q")){break;}
            else{stdNames[i]=name;}
        }
        System.out.println(Arrays.toString(stdNames));


    }
}

/*
İlk olarak, Scanner sınıfından scan adında bir nesne oluşturulur. Bu nesne kullanıcıdan girdileri almak için kullanılır.

Sonra, kullanıcıya "Lütfen eklemek istediğiniz öğrenci sayısını giriniz" şeklinde bir mesaj gösterilir. Kullanıcının girdiği değer numOfElements değişkenine atanır. Bu değer, öğrenci isimlerini tutmak için oluşturulacak dizinin boyutunu belirler.

String stdNames[] = new String[numOfElements] ifadesiyle stdNames adında bir String dizisi oluşturulur. Bu dizi, öğrenci isimlerini saklamak için kullanılır. Dizinin boyutu numOfElements olarak belirlenir.

Sonra, kullanıcıya "İşlemi durdurmak için 'q' ya basınız" şeklinde bir mesaj gösterilir. Bu, kullanıcının döngüyü durdurmak için "q" tuşuna basabileceğini belirtir.

for döngüsü kullanılarak öğrenci isimleri alınır. Döngü, i değişkenini 0'dan başlatır ve stdNames dizisinin uzunluğu kadar devam eder. Her adımda i değeri artırılır.

Her döngü adımında, (i+1) + ". öğrencinin ismini giriniz" şeklinde bir mesaj gösterilir. Kullanıcıdan bir isim girmesi istenir ve girilen değer name adlı bir değişkene atanır. Eğer kullanıcı "q" tuşuna basarsa, break ifadesiyle döngüden çıkılır ve işlem durdurulur. Aksi takdirde, name değeri stdNames dizisinin ilgili elemanına atanır.

Döngü tamamlandıktan sonra, System.out.println(Arrays.toString(stdNames)) ifadesiyle stdNames dizisi ekrana yazdırılır. Arrays.toString() yöntemi, dizinin elemanlarını okunabilir bir şekilde birleştirir.

Bu kodu çalıştırdığınızda, kullanıcıdan istediğiniz sayıda öğrenci ismi alabilirsiniz. "q" tuşuna basarak işlemi durdurabilirsiniz. Ardından, girilen öğrenci isimleri stdNames dizisinde depolanır ve ekrana yazdırılır.
 */