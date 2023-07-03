package grupcalismasi;

public class ForLoopSoru {

    /*
    Konsolda Alfabeyi Yazdıran programi yaziniz.

OUTPUT  :

a b c .. .. .. .. y z

     */

    public static void main(String[] args) {
        //İlk olarak, char veri türünden start adında bir değişken oluşturulur ve 'a' karakterine atanır.
        //Bu, yazdırılmaya başlanacak olan harfin başlangıç karakteridir.
        char start = 'a';

        //Aynı şekilde, char veri türünden end adında bir değişken oluşturulur ve 'z' karakterine atanır.
        // Bu, yazdırılacak son harfi temsil eder.
        char end = 'z';

        //Sonra, for döngüsü kullanılarak c adında bir karakter değişkeni oluşturulur ve start değerinden
        //başlayarak end değerine kadar artırılır.
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
    }
}
/*

Her döngü adımında, System.out.print(c + " ") ifadesiyle c karakteri ve bir boşluk karakteri
 konsola yazdırılır. c karakteri, döngünün her adımında değişir ve başlangıçtan başlayarak
 artarak devam eder. Boşluk karakteri, her harf arasında bir boşluk bırakmak için kullanılır.


 */