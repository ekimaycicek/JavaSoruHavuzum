package çözüleceksorular;

public class NestedLoopSoru1 {

    public static void main(String[] args) {
        // 1 x 1 = 1
// 1 x 2 = 2
// 1 x 3 = 3
// 1 x 4 = 4
// 1 x 5 = 5
// 1 x 6 = 6
// 1 x 7 = 7
// 1 x 8 = 8
// 1 x 9 = 9
// 1 x 10 = 10
// Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz


        for (int i = 1; i <=11 ; i++) {
            for (int j = 1; j <=11 ; j++) {
                System.out.println(i+ "x" +j+ "="+(i*j));


            }System.out.println();
        }

    }
}

/*
Dıştaki for döngüsü, i değişkeniyle 1'den 10'a kadar olan sayıları döndürür. İlk içerideki for döngüsü ise j
değişkeniyle yine 1'den 10'a kadar olan sayıları döndürür.

İç içe geçmiş bu iki döngü ile her bir i değeri için 1'den 10'a kadar olan j değerleriyle çarpım işlemi yapılır
 ve sonuçlar ekrana yazdırılır. Bu işlem, çarpım tablosunun her bir satırını oluşturur.

System.out.println(i + "x" + j + "=" + (i * j)); satırıyla, her bir çarpım işlemi ve sonucu ekrana yazdırılır.
 i ve j değerleriyle çarpım işlemi yapılıp sonuç i * j ile elde edilir. Ardından bu değer, uygun şekilde formatlanarak
  ekrana yazdırılır.

İçteki for döngüsü tamamlandığında, bir satırın çarpım tablosu tamamlanmış olur. Bu noktada System.out.println();
 satırı kullanılarak bir boş satır eklenir, çıktının daha düzenli görünmesi sağlanır.

Dıştaki for döngüsü, tüm satırların çarpım tablosunu oluşturana kadar devam eder.

Sonuç olarak, bu kod parçası 1'den 10'a kadar olan sayılarla çarpım tablosunu ekrana yazdırır. Her bir satır,
 çarpan ve çarpım sonucunu içerir.
 */
