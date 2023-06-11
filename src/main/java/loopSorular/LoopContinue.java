package loopSorular;

import java.util.Scanner;

public class LoopContinue {

    public static void main(String[] args) {

     /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.
    */

    // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden kodu yazınız

        Scanner sc = new Scanner(System.in);//İlk olarak, Scanner sınıfını kullanarak kullanıcıdan veri girişi alabilmek için bir Scanner nesnesi olan sc oluşturulur.

        System.out.println("mail giriniz: ");//Kullanıcıya "mail giriniz: " mesajı System.out.println() yöntemiyle ekrana yazdırılır.

        String mail = sc.nextLine();//Kullanıcının girdiği e-posta adresi sc.nextLine() yöntemiyle okunur ve mail adlı bir String değişkenine atanır.



        for (int i = 0; i < mail.length(); i++) {//for döngüsü kullanılarak i değişkeni 0'dan başlayarak mailin uzunluğuna kadar artırılır.

            char c = mail.charAt(i);//Her döngü adımında, charAt(i) yöntemi kullanılarak maildeki i indeksine karşılık
            // gelen karakter alınır ve c adlı bir char değişkenine atanır.

            if (c == ' ') {//if koşulu kullanılarak, c karakterinin boşluk karakteri (' ') olup olmadığı kontrol edilir.

                continue;//Eğer c karakteri bir boşluk karakteri ise, continue ifadesiyle döngünün bir sonraki adımına geçilir ve geri kalan kodlar atlanır.

            } System.out.print(c);//Eğer c karakteri bir boşluk karakteri değilse, System.out.print(c) yöntemiyle c karakteri ekrana yazdırılır.
        }


    }
}
