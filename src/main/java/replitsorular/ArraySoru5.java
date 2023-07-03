package replitsorular;

public class ArraySoru5 {

    /*
yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

```
Aranan Değer:2020
```

```
Beklenen Çıktı:**True**
```

```
Aranan Değer:2010
```

```
Beklenen Çıktı :**False**
```
     */


        public static void main(String[] args) {

            int[] array = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

            int arananDeger = 2020;



            boolean bulundu = false;


            for (int i = 0; i < array.length; i++) {


                if (array[i] == arananDeger) {
                    bulundu = true;
                    break;
                }
            }

            System.out.println("Aranan Değer: " + arananDeger);
            System.out.println("Beklenen Çıktı: " + bulundu);
        }
    }

