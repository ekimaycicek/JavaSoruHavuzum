package replitSorular;

public class ArraySoru4 {

    /*

    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

```
Beklenen Çıktı:
```

```
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
```
     */

    public static void main(String[] args) {

            int satir = 10;
            int sutun = 10;


            for (int i = 0; i < satir; i++) {

                for (int j = 0; j < sutun; j++) {
                    System.out.print("0  ");
                }
                System.out.println();
            }
        }
    }


