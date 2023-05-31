import java.util.Scanner;

public class LoopSoru4 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
          hesaplayan kodu yazın
          Örnek Ekran Çıktısı
        Girilen sayı=4
       Kareler toplamı=14
       */


        Scanner sc=new Scanner(System.in); //İlk olarak, Scanner sınıfını kullanarak kullanıcıdan veri girişi alabilmek için bir Scanner nesnesi olan sc oluşturulur

        System.out.println("1 den büyük sayı giriniz: "); //Kullanıcıya "1 den büyük sayı giriniz: " mesajı System.out.println() yöntemiyle ekrana yazdırılır.

        int sayı=sc.nextInt();//Kullanıcının girdiği sayı sc.nextInt() yöntemiyle okunur ve sayı değişkenine atanır.

        int toplam=0;//toplam adında bir int değişkeni oluşturulur ve başlangıç değeri olarak 0 atanır.

        for (int i = 1; i <sayı ; i++) { //for döngüsü kullanılarak i değişkeni 1'den başlayarak sayı'ya kadar artırılır.

            toplam+=(i*i);//Her döngü adımında, i'nin karesi i*i hesaplanır ve toplam değişkenine eklenir.




        } System.out.println("toplam = " + toplam);

    }
    }

/*


Kodun çalışma örneği olarak, kullanıcı 5 sayısını girdiğinde, döngü 1, 2, 3 ve 4 için sırasıyla 1, 4, 9 ve 16 olmak üzere
karelerini hesaplar ve toplamı 30 olarak bulur. Bu değer ekrana yazdırılır.
 */