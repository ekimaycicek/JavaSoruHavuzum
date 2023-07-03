package grupcalismasi;

import java.util.Scanner;

public class KelimeSorusu {

    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen mesajınızı giriniz");
        String sentences = input.nextLine();//Kullanıcının girdiği metin, input.nextLine() ifadesiyle sentences
        // adlı bir String değişkene atanır.
        LongestWords(sentences);
    }
    public static String LongestWords(String sentences) {//Daha sonra, LongestWords adlı bir metot çağrılır ve sentences
        // değişkeni bu metoda aktarılır.

        String[] words = sentences.split(" ");//LongestWords metodu, gelen sentences metnini
        // boşluklara göre ayırarak words dizisini oluşturur.

        String longestWord = "";//Ardından, longestWord adlı bir String değişkeni tanımlanır ve en
        // uzun kelimeyi tutacak şekilde başlangıçta boş bir değere atanır.

        int maxLength=0;//maxLength adlı bir int değişkeni de tanımlanır ve başlangıçta
        //0 olarak atanır. Bu değişken, en uzun kelimenin karakter uzunluğunu tutar.

        System.out.println("Uzun kelimeler:");//Sonraki adımda, "Uzun kelimeler:" şeklinde bir mesaj konsola yazdırılır.

        for (String word : words) {//words dizisindeki her kelime için for-each döngüsü kullanılır.
            // Her bir kelime word değişkenine atanır ve döngü içinde işlemler yapılır.

            if (word.length() > maxLength) {//Her döngü adımında, word.length() ifadesiyle word
                // kelimesinin karakter uzunluğu hesaplanır

                maxLength= word.length(); // ve maxLength değeriyle karşılaştırılır
                longestWord= word; // Eğer word kelimesinin uzunluğu maxLength değerinden büyükse,
                // maxLength güncellenir ve longestWord değeri word olarak güncellenir.

            }
        }System.out.println(longestWord);
        return longestWord;
    }
}
