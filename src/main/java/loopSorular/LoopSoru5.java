import java.util.Scanner;

public class LoopSoru5 {

    public static void main(String[] args) {

        //girilen bir String'deki rakam sayısını hesaplayan method yazınız


        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz");
        String str=sc.nextLine();
        int rakam=0;
        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                rakam++;

            }
        }System.out.println("Girilen cümlede : "+rakam+" adet rakam vardır. ");
    }
/*
İlk olarak, Scanner sınıfı kullanılarak bir Scanner nesnesi oluşturulur ve kullanıcıdan metin girmesi istenir.

Daha sonra, girilen metin str adlı bir String değişkenine atanır.

Sonrasında, bir rakam değişkeni oluşturulur ve başlangıçta 0 değeriyle başlatılır. Bu değişken, metinde bulunan rakam sayısını tutacak.

Döngü for döngüsüyle, metnin her bir karakterini kontrol eder. Döngü, metin uzunluğu kadar çalışır.

Her bir karakter için, charAt() yöntemi kullanılarak metindeki karaktere erişilir. Daha sonra, >= '0' ve <= '9'
ifadeleri kullanılarak karakterin bir rakam olup olmadığı kontrol edilir.

Eğer karakter bir rakamsa, rakam değişkeni bir artırılır.

Döngü tamamlandıktan sonra, rakam değişkeninin değeri konsola yazdırılır. Bu değer, girilen metindeki rakam sayısını temsil eder.

Özetle, yukarıdaki kod bloğu, kullanıcının girdiği metinde kaç adet rakam olduğunu bulan bir programdır.
 */
}





