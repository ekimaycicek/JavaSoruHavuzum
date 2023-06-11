package loopSorular;

public class LoopSoru7 {

    public static void main(String[] args) {

        //0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden kodu yazınız



        for (int i = 1; i <=100; i++) {

            if ((i%4==0 && i%5==0)){

                System.out.println(i+" ");
            }

        }
/*
Bu kod bloğu, 1'den 100'e kadar olan sayıları kontrol eder ve her bir sayı için aşağıdaki
 şartı kontrol eder:

i sayısı hem 4'e hem de 5'e tam bölünmelidir.
Eğer bu şart sağlanıyorsa (yani i sayısı 4'e ve 5'e tam bölünebiliyorsa), i sayısını konsola yazdırır.

Özetle, yukarıdaki kod bloğu, 1'den 100'e kadar olan sayılardan hem 4'e hem de 5'e tam
bölünebilen sayıları
 bulur ve bu sayıları konsola yazdırır.





 */

    }
}
