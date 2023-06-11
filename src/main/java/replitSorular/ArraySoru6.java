package replitSorular;

public class ArraySoru6 {

/*
Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

```
Aranan değer:56
```

```
Beklenen Çıktı:
```

```
56 sayısı arrayin 4. elemanı
 */


        public static void main(String[] args) {

            int[] array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};



            int arananDeger = 56;



            int index = -1;


            for (int i = 0; i < array.length; i++) {


                if (array[i] == arananDeger) {
                    index = i;
                   break;
                }
            }
            System.out.println("Aranan Değer: " + arananDeger);


            if (index != -1) {
                System.out.println(arananDeger + " sayısı arrayin " + (index + 1) + ". elemanı");
            } else {
                System.out.println("Aranan değer bulunamadı.");
            }
        }
    }
