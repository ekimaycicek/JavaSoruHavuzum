package arraysorular;

public class ArraySoru6 {
    public static void main(String[] args) {

        /*
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[]= {1,2,3,4,5,6,7};
        int toplam=0;



        for (int i = 0; i <input.length ; i++) {

            toplam+=input[i];
        }
        double ort=toplam/input.length;
        System.out.println("ort = " + ort);

        System.out.println("ort dan büyük elemanlar");
        for (int i = 0; i < input.length; i++) {

            if (input[i] > ort) {

                System.out.println("i = " + i);
            }

        }



    }
}

/*
İlk olarak, input adında bir tamsayı dizisi oluşturulur ve gerekli değişkenler tanımlanır. Ardından, for döngüsü kullanılarak
 dizi elemanları toplanır ve toplam değişkenine eklenir.

Daha sonra, dizinin uzunluğu (input.length) kullanılarak ortalaması hesaplanır ve ort adlı bir double değişkende saklanır.
 Bu hesaplama, toplamı dizinin uzunluğine bölen basit bir işlemdir.

Son olarak, bir for döngüsü kullanarak dizinin elemanları tek tek kontrol edilir. Eğer bir eleman, ortalamadan büyükse,
 bu elemanın dizideki indeksi ekrana yazdırılır.

Örneğin, input dizisi {1,2,3,4,5,6,7} şeklinde tanımlanmışsa, bu dizi toplamı 28'dir ve dizinin uzunluğu 7'dir.
Bu durumda, 28/7 = 4 olarak hesaplanan ortalamadır.


 */
