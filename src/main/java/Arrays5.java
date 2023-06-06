import java.util.Arrays;

public class Arrays5 {

    public static void main(String[] args) {



    /*

      Verilen bir int dizisi icin elemanlarin karelerini bulun
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */

    int arr[]={2,6,4,5,8,9};


        for (int i = 0; i < arr.length ; i++) {
        arr[i] *= arr[i];



    }System.out.println("elemanların karesi : " + Arrays.toString(arr));



    }}



/*
İlk olarak, arr adında bir tamsayı dizisi tanımlanır ve içerisine değerler atanır.

Daha sonra for döngüsü kullanarak dizinin her bir elemanının karesini hesaplar.
 Her iterasyonda arr[i] *= arr[i] ifadesi kullanılarak, i indeksine sahip elemanın karesiyle güncellenir.

Son olarak, System.out.println() ifadesi ile yeni diziyi çıktı olarak görüntüler. Arrays.toString()
 metodu kullanılarak dizinin elemanları okunabilir bir formatta çıktıya dönüştürülür.

Örneğin, verilen dizideki elemanlar {2, 6, 4, 5, 8, 9} ise çıktı olarak {4, 36, 16, 25, 64, 81}
görüntülenir. Her bir elemanın karesi doğru bir şekilde hesaplanmıştır.





 */