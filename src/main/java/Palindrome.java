import java.util.Scanner;

public class Palindrome {

    /*
       Crteate a program checks if a String is PALINDROME or not.
       If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
       For Example : "madam" or "nursesrun" .
       Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
       polindrome :tersten okunuşu da aynı olan ifadeierdir.
       ornek : Ey edip Adanada pide ye,  Traş niçin şart
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String ifade = scan.nextLine();

        palindromeWithStringBuilder(ifade);//palindromeWithStringBuilder adlı bir metodu çağırır
        // ve ifade olarak adlandırılan bir dize parametresi geçerir. Bu metot, verilen ifadeyi
        // ters çevirir ve palindrom olup olmadığını kontrol eder.

        palindromeWithForLoop(ifade);//palindromeWithForLoop(ifade) ifadesi, girilen ifadeyi
        // palindromeWithForLoop metoduna ileterek palindrom kontrolünü gerçekleştirmek
        // üzere kullanılır. en son yap.

    }

    public static void palindromeWithForLoop(String str) {//Bu metot,
        // verilen dizeyi ters çevirir ve palindrom olup olmadığını
        // kontrol eder.


        String tersStr = "";
        //Boş bir dize tanımlamamız gerekiyor çünkü her karakteri tersstr ye eklemek için döngüyü kullanırken
        // ters çevrilmemiş bir dizeye başlamak istiyoruz.


        //i değişkeni 0 veya daha büyük olduğu sürece döngü devam eder.
        // Yani, döngü son karakterin indeksinden başlayarak ilk karakterin indeksine kadar çalışır.
        for (int i = str.length()-1; i >=0 ; i--) {


            //str.charAt(i): str dizesinin i indeksindeki karakteri döndürür.
            //str.charAt(i) ile aldığımız karakteri tersStr dizesine eklemek için kullanılır.
            tersStr += str.charAt(i);
        }
        System.out.println("tersStr = " + tersStr);

        //tersStr dizesini str dizesiyle karşılaştırır. Eğer bu iki dize birbirine eşitse,
        // yani tersStr dizesi str dizesinin palindromu ise, if bloğu içindeki kod çalıştırılır.
        if(tersStr.equalsIgnoreCase(str)){

            System.out.print("girilen ifade palindromdur -> " + tersStr);

        }else System.out.print("girilen ifade palindrom degildir ->" +tersStr);
    }


    public static void palindromeWithStringBuilder(String str) {

        //StringBuilder sınıfı, bir dizede karakterlerin ekleme, çıkarma veya değiştirme
        // gibi işlemleri daha verimli bir şekilde yapmamıza olanak sağlar.
        StringBuilder sb = new StringBuilder(str);

        //reverse() yöntemi, StringBuilder'daki karakterlerin sırasını tersine çevirir.
        //String türünde olduğu için, bu ters çevrilmiş karakterleri bir String olarak
        // elde etmek için toString() yöntemi kullanılır. Bu yöntem, StringBuilder
        // nesnesini bir String'e dönüştürür.
        String tersStr = sb.reverse().toString();

        // Eğer bu iki dize birbirine eşitse, yani tersStr dizesi str dizesinin palindromu
        // ise, if bloğu içindeki kod çalıştırılır.
        if(tersStr.equalsIgnoreCase(str)){

            System.out.println("girilen ifade palindomdur -> " + tersStr);
        }else System.out.println("girilen ifade palindrom degildir ->" +tersStr);
    }

}
