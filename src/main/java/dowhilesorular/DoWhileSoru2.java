package dowhilesorular;

import java.util.Scanner;

public class DoWhileSoru2 {

    public static void main(String[] args) {

        //task->girilen bir metinde harf rakam ve özel karakter sayısını print eden kodu yazınız

        Scanner sc = new Scanner(System.in);//İlk olarak, Scanner sınıfını kullanarak kullanıcıdan veri girişi alabilmek için bir Scanner nesnesi olan sc oluşturulur.

        System.out.println("metin giriniz");//Kullanıcıya "metin giriniz" mesajı System.out.println() yöntemiyle ekrana yazdırılır.

        String metin = sc.nextLine();//Kullanıcının girdiği metin sc.nextLine() yöntemiyle okunur ve metin adlı bir String değişkenine atanır.

        //countHarf, countSayı, countOzel adında üç ayrı int değişkeni oluşturulur ve başlangıç değerleri olarak 0 atanır.
        // Bu değişkenler, metindeki harf, sayı ve özel karakterlerin sayılarını tutar.
        int countHarf = 0;
        int countSayı = 0;
        int countOzel = 0;
        int index = 0; //index adında bir int değişkeni oluşturulur ve başlangıç değeri olarak 0 atanır. Bu değişken, metin üzerinde gezinmek için kullanılır.


        do {
//a. Döngü içinde, if-else if-else koşulları kullanılarak her karakterin hangi kategoriye (harf, sayı, özel karakter) ait olduğu kontrol edilir.

            if (metin.charAt(index) >= '0' && metin.charAt(index) <= '9') {// İlk olarak, if koşulu kullanılarak karakterin bir
                // sayı olup olmadığı kontrol edilir. Karakter '0' ile '9' arasında ise ('0' <= karakter <= '9'), countSayı değişkeni bir artırılır.


                countSayı++;
            } else if (metin.toLowerCase().charAt(index) >= 'a' && metin.toLowerCase().charAt(index) <= 'z') {//c. Ardından, else if koşulu kullanılarak
                // karakterin bir harf olup olmadığı kontrol edilir. Karakter 'a' ile 'z' arasında ise ('a' <= karakter <= 'z'), countHarf değişkeni bir
                // artırılır. Büyük-küçük harf ayrımı yapmamak için metin önceden küçük harflere dönüştürülür.

                countHarf++;

            } else countOzel++;//d. Eğer karakter bir sayı veya harf değilse, else bloğu çalışır ve countOzel değişkeni bir artırılır.


            index++; //e. Son olarak, index değişkeni bir artırılır.



        }
        while (index<metin.length()); //Döngü index metnin uzunluğuna (metin.length()) eşit olana kadar devam eder.

        System.out.println("countHarf = " + countHarf);
        System.out.println("countSayı = " + countSayı);
        System.out.println("countOzel = " + countOzel);

    }
}

