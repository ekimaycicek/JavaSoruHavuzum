package replitSorular;

public class ArraySoru9 {

/*
Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

Array: [1,2,3,4,5,6,7,8,9]

```
Beklenen Çıktı:
```

```
Tek Sayilar: 5
```

```
Cift Sayilar: 4
```
 */
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            int tekSayi = 0;
            int ciftSayi = 0;

            for (int i = 0; i < numbers.length; i++) {


                if (numbers[i] % 2 == 0) {
                    ciftSayi++;

                } else {
                    tekSayi++;
                }
            }

            System.out.println("Tek Sayılar: " + tekSayi);
            System.out.println("Çift Sayılar: " + ciftSayi);
        }
    }

