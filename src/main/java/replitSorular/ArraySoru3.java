package replitSorular;

public class ArraySoru3 {

/*
Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]

```
Beklenen Çıktı:
```

```
Array Sayılarının ortalaması: 7.0
```
 */


        public static void main(String[] args) {



            int[] array = {20, 30, 25, 35, -16, 60, -100};


            double toplam = 0;

            for (int i = 0; i < array.length; i++) {
                toplam += array[i];
            }

            double ortalama = toplam / array.length;
            System.out.println("Array Sayılarının ortalaması: " + ortalama);
        }
    }

