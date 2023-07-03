package grupcalismasi;

import java.util.Arrays;

public class ArraySoru {

    ////{2,3,6,8,0,9} tüm sayıların yerine 8 sayısını koyunuz

    public static void main(String[] args) {
        int[] dizi = {2, 3, 6, 8, 0, 9};
        int yeniSayi = 8;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = yeniSayi;
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
    }
}

/*
İlk olarak, int[] dizi adında bir int türünde dizi oluşturulur ve {2, 3, 6, 8, 0, 9} değerlerini içerecek şekilde başlatılır. Bu dizi, değiştirilecek sayıları içeren orijinal dizi olarak düşünülebilir.

Ardından, int yeniSayi = 8 ifadesiyle yeniSayi adında bir değişken tanımlanır ve değeri 8 olarak atanır. Bu, orijinal dizideki tüm sayıların yerine geçecek sayıdır.

for döngüsü kullanılarak dizi elemanlarına erişilir. Döngü, i değişkenini 0'dan başlatır ve dizi uzunluğu (dizi.length) kadar devam eder. Her adımda i değeri artırılır.

Her döngü adımında, dizi[i] = yeniSayi ifadesiyle dizi elemanının değeri yeniSayi ile değiştirilir. Yani, dizinin her bir elemanı 8 ile değiştirilir.
 */