package arraysorular;

import java.util.Scanner;

public class ArraySoru8 {

    public static void main(String[] args) {

        /*
    Kullanicidan aldigimiz 8 elemanli arrayin icinde
    kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
    */


        Scanner scanner = new Scanner(System.in);

        int arr[]  =new int[8];//İlk olarak, arr adında 8 elemanlı bir tamsayı dizisi oluşturulur.

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " .indexteki elemani giriniz :");
            arr[i] =scanner.nextInt();

            // if koşulu kullanılarak elemanın 3'e tam bölünebilir
            // olduğu kontrol edilir
            //Ayrıca, elemanın sıfır
            // olmadığından emin olmak için (arr[i] != 0) bir koşul daha eklenir.
            if(arr[i]%3 ==0 && arr[i]!=0){

                //Bu koşullar sağlandığında, eleman ekrana yazdırılır ve count değişkeni
                //   bir artırılır.
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

