package loopSorular;

import java.util.Scanner;

public class LoopSoru6 {

    public static void main(String[] args) {

        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false

         * */


        Scanner sc = new Scanner(System.in); //İlk olarak, Scanner sınıfını kullanarak kullanıcıdan veri girişi alabilmek için bir Scanner nesnesi olan sc oluşturulur.

        System.out.println("sayı giriniz: ");//Kullanıcıya "sayı giriniz: " mesajı System.out.println() yöntemiyle ekrana yazdırılır.

        int sayı = sc.nextInt();//Kullanıcının girdiği sayı sc.nextInt() yöntemiyle okunur ve sayı değişkenine atanır.

        System.out.println(getAsalMı(sayı));//Ana main metodu içinde, getAsalMı metodu çağrılarak kullanıcının girdiği sayının asal
        // olup olmadığı kontrol edilir ve sonuç ekrana yazdırılır. bunu en son yapiyoruz


    }

    private static boolean getAsalMı(int sayı) {//getAsalMı adında bir private static metot tanımlanır. Bu metot, bir sayının asal olup olmadığını kontrol
        // eder ve boolean türünde bir değer döndürür.

        boolean asalmı = true;//asalmı adında bir boolean değişkeni oluşturulur ve başlangıç değeri olarak true atanır. Bu değişken, sayının asal olup olmadığını temsil eder.

        for (int i = 2; i < sayı; i++) {//for döngüsü kullanılarak i değişkeni 2'den başlayarak sayı'ya kadar artırılır.

            if (sayı % i == 0) {//Her döngü adımında, if koşulu kullanılarak sayı'nın i'ye tam bölünüp bölünmediği kontrol edilir.

                asalmı=false;//Eğer sayı i'ye tam bölünüyorsa, asalmı değişkeni false olarak güncellenir, çünkü sayı asal değildir.



            }
        }
        return asalmı;//Döngü tamamlandıktan sonra, asalmı değişkeni döndürülür.
    }

}

/*

Kodun çalışma örneği olarak, kullanıcı 13 sayısını girdiğinde, getAsalMı metodu 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ve 12'ye kadar olan sayıları kontrol eder.
sayı sadece 1'e ve kendisine tam bölünebildiği için asalmı değeri true olarak kalır. Bu durumda, ekrana "true" yazdırılır, çünkü 13 asaldır.
 */