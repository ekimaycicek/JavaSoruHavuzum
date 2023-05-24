public class NestedTernary {


    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char not = 'F';//not adlı bir char değişkeni oluşturuluyor ve 'F' değeri atanıyor.
        // Bu değer, final notunu temsil ediyor.

        //İç içe geçmiş ternary operatörleri kullanarak result adlı bir String değişkeni oluşturuluyor
        // ve not değerine göre sonucun belirlenmesi sağlanıyor.

        //İlk ternary ifade, not'un 'A' olup olmadığını kontrol ediyor. Eğer doğru ise, "gayet basarılı" değeri atanır.

        //İlk else if ifadesi, not'un 'B' olup olmadığını kontrol ediyor. Eğer doğru ise, "basarılı" değeri atanır.

        //İkinci else if ifadesi, not'un 'C' olup olmadığını kontrol ediyor. Eğer doğru ise, "ha gayret" değeri atanır.

        //Eğer yukarıdaki koşullardan hiçbiri doğru değilse, else ifadesi çalışır ve "diğerleri" değeri atanır.


        String result = not == 'A' ? "gayet basarılı" : not == 'B' ? "basarılı" : not == 'C' ? "ha gayret" : "diğerleri";
        System.out.println("result = " + result);//Son olarak, result değeri ekrana yazdırılır.


    }
}