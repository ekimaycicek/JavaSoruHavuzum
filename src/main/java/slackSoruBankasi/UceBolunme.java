package slackSoruBankasi;
import java.util.Scanner;
public class UceBolunme {

    public static void main(String[] args) {


        /* TASK :
    Kullanicidan aldigimiz 8 elemanli arrayin icinde
    3 e bölünebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
    */


//İlk olarak, 8 elemanlık bir tamsayı dizisi (array) oluşturulur.
// Ardından, Scanner sınıfı kullanılarak kullanıcıdan giriş alınır.
        int[] array = new int[8];
        Scanner input = new Scanner(System.in);


        //for döngüsü kullanılarak kullanıcıdan 8 adet sayı alınır ve bu sayılar array dizisine sırasıyla yerleştirilir.
        System.out.println("agam 8 eleman gir");
        for (int i = 0; i < 8; i++) {//for döngüsü kullanarak 0'dan başlayarak i'nin değeri 8 olana kadar (8 dahil değil) döngüyü döndürürüz
            array[i] = input.nextInt();//Döngünün her bir iterasyonunda, input.nextInt() ifadesi kullanıcıdan bir tamsayı
            // girmesini bekler ve bu değeri array dizisinin i. indeksine atar. nextInt() metodunun çağrılmasıyla
            // program kullanıcının giriş yapmasını bekler ve kullanıcının girdiği değeri alır.
            //Örneğin, döngünün ilk iterasyonunda i değeri 0 olacak ve kullanıcıdan bir sayı girmesi istenecektir.
            // Kullanıcı sayıyı girdikten sonra nextInt() metodu bu sayıyı alacak ve array[0] indeksine yerleştirecektir.
            // Döngü bu şekilde 8 kez devam eder ve kullanıcının girdiği 8 sayı sırasıyla array dizisinin ilgili
            // indekslerine yerleştirilir.
        }

        int a = 0;//Sonrasında, a adında bir değişken oluşturulur ve başlangıçta 0 olarak atanır.
        // Bu değişken, 3'e tam bölünebilen sayıların sayısını tutmak için kullanılacak.


        //Tekrar bir for döngüsü kullanarak array dizisini tararız. Her eleman için, o elemanın 3'e tam bölünebilme
        // durumu kontrol edilir (array[i] % 3 == 0). Eğer bu koşul sağlanıyorsa, a değişkeni 1 artırılır.
        for (int i = 0; i < 8; i++) {
            if (array[i] % 3 == 0) {
                a++;
            }
        }

        System.out.println("Dizideki 3 e bölünen sayı adedi:" + a);
    }
}
/*
Eğer negatif sayıları kabul etmek veya etmemek konusunda bir gereklilik veya kısıtlama yoksa,
 programın tasarımına bağlı olarak negatif sayıları kabul etmek tercih edilebilir.
 Böylece, program genel bir esneklik sunar ve negatif sayıları hesaplamalara dahil eder.
 */