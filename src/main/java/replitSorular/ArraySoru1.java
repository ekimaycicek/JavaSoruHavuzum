package replitSorular;

import java.util.Arrays;

public class ArraySoru1 {

    /*

    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

```
Test Data:
```

```
[1232, 1134,2345,1022]
```

```
[Java, Python, PHP, C#, C Programming, C++]
```

```
Beklenen Çıktı:
```

```
[1022,1134,1232,2345]
```

```
[C Programming, C#, C++, Java, PHP, Python]
```




     */


    public static void main(String[] args) {

        int[] sayilar = {1232, 1134, 2345, 1022};
        String[] kelimeler = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};


        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(kelimeler));
    }
}

