package çözüleceksorular;

import java.util.Scanner;

public class NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen not giriniz");
        char not = scan.next().toUpperCase().charAt(0);


        String result = not == 'A' ? "gayet basarılı" : not == 'B' ? "basarılı" : not == 'C' ? "ha gayret" : "diğerleri";
        System.out.println(result);//Son olarak, result değeri ekrana yazdırılır.


    }
}

/*
İlk olarak, not adlı bir char değişkeni oluşturulur ve değeri 'F' olarak atanır. Bu değişken, bir notu temsil etmektedir.

Daha sonra, bir result adlı String değişkeni oluşturulur ve değeri ternary operatörleri kullanarak belirlenir. Ternary operatörleri, bir koşulu değerlendirerek farklı sonuçlar döndürmek için kullanılır.

Ternary operatörünün yapısı şu şekildedir:


koşul ? sonuç1 : sonuç2
Koşul doğru ise sonuç1, koşul yanlış ise sonuç2 değeri döndürülür.

Bu kod parçasında, result değeri aşağıdaki gibi belirlenir:

Eğer not değeri 'A' ise, result değeri "gayet basarılı" olur.
Eğer not değeri 'B' ise, result değeri "basarılı" olur.
Eğer not değeri 'C' ise, result değeri "ha gayret" olur.
Yukarıdaki koşulların hiçbiri sağlanmazsa, yani not değeri 'A', 'B' veya 'C' değilse, result değeri "diğerleri" olur.
Son olarak, System.out.println("result = " + result); satırıyla result değeri ekrana yazdırılır. + operatörü kullanılarak result değeri String ifadeyle birleştirilir ve çıktı oluşturulur.

Bu şekilde, not değişkeninin değerine göre farklı sonuçlar üreten bir yapı oluşturulmuş olur.
 */
