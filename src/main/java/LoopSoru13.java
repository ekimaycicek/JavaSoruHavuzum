public class LoopSoru13 {

    public static void main(String[] args) {


    //3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden kodu yazınız


        int adet=1;//İlk olarak, adet adında bir int değişkeni oluşturulur ve başlangıç değeri olarak 1 atanır. Bu değişken,
        // bulunan sayıların sırasını takip etmek için kullanılır.

        for (int i =999; i >99; i--) { //for döngüsü kullanılarak i değişkeni 999'dan başlayarak 100'e kadar olan sayıları kontrol eder.

            if (i%4==0 && i%6==0){ //Her döngü adımında, if koşulu kullanılarak i sayısının hem 4'e hem de 6'ya tam bölünüp bölünmediği kontrol edilir.

               System.out.println(adet+". sayı " + i +" ");//Eğer i hem 4'e hem de 6'ya tam bölünüyorsa, System.out.println() yöntemiyle adet değeri
                // ve i sayısı ekrana yazdırılır.
                adet++;
                //adet değişkeni bir artırılarak bir sonraki bulunan sayının sırası belirlenir.

                //Döngü devam ettikçe, her bulunan sayı ve sırası ekrana yazdırılır.
            }





        }  } }

