import java.util.Scanner;

public class NestedLoopSoru3 {

    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner sc=new  Scanner(System.in);


        System.out.println("bir cumle giriniz : ");

        String  cumle=sc.nextLine();
        System.out.println("sayılacak harfi giriniz : ");

        char harf=sc.next().charAt(0);
        int harfSayisi=0;


        for (int i = 0; i <cumle.length(); i++) {

            if(cumle.charAt(i)==harf){
                harfSayisi++;

            }

        }

        System.out.println("girdiğiniz cümle: " + cumle+"de istediğiniz harf : " + harf + harfSayisi+ "kadar var" );



    }
}

/*
İlk olarak, Scanner sınıfı kullanılarak bir Scanner nesnesi oluşturulur ve kullanıcıdan bir cümle girmesi istenir.
 Girilen cümle cumle adlı bir String değişkenine atanır.

Daha sonra, kullanıcıdan sayılacak harfi girmesi istenir. Girilen harf harf adlı bir char değişkenine atanır.
next() metodu yerine nextLine() metodu kullanıldığından, char tipindeki harf için next().charAt(0) kullanılarak ilk karakter alınır.

harfSayisi adlı bir int değişkeni oluşturulur ve 0 olarak başlatılır. Bu değişken, harfin cümle içerisinde
kaç kez geçtiğini tutmak için kullanılacak.

Daha sonra, bir for döngüsü kullanılarak cümledeki her bir karakter kontrol edilir. Döngü, 0'dan başlayarak
cumle.length() değerine kadar çalışır.

Her bir karakter cumle.charAt(i) kullanılarak kontrol edilir. Eğer karakter, girilen harf ile eşleşiyorsa,
 harfSayisi değişkeni bir artırılır.

Son olarak, cümle ve harf sayısı ekrana yazdırılır.

Özetle, kullanıcının girdiği cümlede belirtilen harf kaç kez geçiyorsa bu sayı ekrana yazdırılır.





 */
