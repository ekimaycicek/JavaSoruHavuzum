package replitSorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySoru7 {

    /*

    Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]
```


     */


        public static void main(String[] args) {

            String[] array = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};



            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
            System.out.println(arrayList);
        }


    }

