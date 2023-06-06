public class Arrays4 {

    public static void main(String[] args) {

        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */




        int arr1[][] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2[][] = { {-7,6,-9}, {0,12}, {19} };//Bu dizi, 3 satır ve farklı sütun sayılarına
        // sahip elemanlardan oluşur. İlk satır 3 elemandan, ikinci satır 2 elemandan ve üçüncü satır 1 elemandan oluşur.

        int toplam=0;


        /*
        Bu döngü bloğu, arr1 isimli iki boyutlu dizinin tüm elemanlarının toplamını hesaplar.

Dıştaki döngü, arr1 dizisinin satırlarını temsil eder ve i değişkeniyle bu satırların indislerini kontrol eder.
İlk satırdan başlayarak son satıra kadar ilerler.

İçteki döngü ise, her bir satırdaki elemanlara erişmek için kullanılır. arr1[i] ifadesiyle, i indisine sahip
satırdaki elemanlara ulaşılır. Ardından, j değişkeni kullanılarak satırdaki her bir elemana erişilir. Bu döngü,
her satırın elemanları üzerinde dolaşır.

Her eleman için toplam değişkenine eklenir. Bu şekilde, tüm elemanlar gezildikten sonra toplam değişkeni,
arr1 dizisindeki tüm elemanların toplamını içerir.

Sonuç olarak, bu döngü bloğu, arr1 dizisindeki elemanların toplamını hesaplar ve toplam değişkenine kaydeder.
         */
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr1[i].length; j++) {

                toplam+=arr1[i][j];
            }

        }
        System.out.println("toplam = " + toplam);


        int toplam1=0;

        for (int i = 0; i <arr2.length; i++) {
            for (int j = 0; j <arr2[i].length; j++) {

                toplam1+=arr2[i][j];
            }

        }
        System.out.println("toplam1 = " + toplam1);
/*
iki tane System.out.println() ifadesi kullanılmasının nedeni, arr1 ve arr2 dizilerinin elemanlarının toplamlarını ayrı ayrı
 ekrana yazdırmaktır.

İlk System.out.println() ifadesi, toplam değişkeninin değerini ekrana yazdırır ve bu arr1 dizisindeki elemanların toplamını gösterir.

İkinci System.out.println() ifadesi ise, toplam1 değişkeninin değerini ekrana yazdırır ve bu arr2 dizisindeki
 elemanların toplamını gösterir.

Böylece, her bir dizinin elemanlarının toplamlarını ayrı ayrı görmüş oluruz.





 */
    }
    }


/*
for döngüsü dışına System.out.println() ifadesini yazdığımızda, döngü tamamlandıktan sonra toplam değerini ekrana yazdırmış oluruz.
 Yani döngü içindeki her bir  toplam veya toplam1 değişkeni üzerinde yapılan toplama işlemi sonucunda
  elde edilen değerler döngü içinde geçici olarak tutulur. Ancak bu değerleri kullanıcıya göstermek için döngü
  tamamlandıktan sonra, yani döngü dışında System.out.println() ifadesi ile ekrana yazdırırız. Bu sayede, tüm iterasyonlar
   tamamlandıktan sonra toplam değeri ekrana çıktı olarak verilir.





 */