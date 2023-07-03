package arraysorular;

import java.util.Scanner;

public class ArraySoru8 {

    public static void main(String[] args) {

        /*
    Kullanicidan aldigimiz 8 elemanli arrayin icinde
    kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
    */


        Scanner scanner = new Scanner(System.in);
        int arr[]  =new int[8];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " .indexteki elemani giriniz :");
            arr[i] =scanner.nextInt();
            if(arr[i]%3 ==0 && arr[i]!=0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

/*
Bu program, kullanıcıdan 8 elemanlı bir tamsayı dizisi girmesini isteyen
 ve bu dizide 3'e tam bölünebilen elemanları ve bunların sayısını yazdıran
  bir programdır.

İlk olarak, arr adında 8 elemanlı bir tamsayı dizisi oluşturulur. Scanner
 sınıfı kullanılarak kullanıcıdan veri almak için bir scanner nesnesi
 oluşturulur.

Daha sonra, bir döngü kullanarak kullanıcıdan dizinin her bir elemanını
 alırız. i değişkeni 0'dan başlayarak dizinin boyutuna kadar artar.
  Kullanıcıdan veri almak için scanner.nextInt() kullanılır ve
  girilen değer arr dizisinin ilgili indeksine atanır.

Daha sonra, if koşulu kullanılarak elemanın 3'e tam bölünebilir
 olduğu kontrol edilir (arr[i] % 3 == 0). Ayrıca, elemanın sıfır
 olmadığından emin olmak için (arr[i] != 0) bir koşul daha eklenir.
  Bu koşullar sağlandığında, eleman ekrana yazdırılır ve count değişkeni
   bir artırılır.

Son olarak, döngü tamamlandığında, count değişkeni ekrana yazdırılarak
3'e tam bölünebilen elemanların sayısı gösterilir.
 */