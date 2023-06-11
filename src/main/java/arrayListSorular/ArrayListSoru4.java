package arrayListSorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSoru4 {

    public static void main(String[] args) {

        /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 */

        String arr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        yeniList(arr);


    }

    private static void yeniList(String[][] arr) {

        List<String> boslist1 = new ArrayList<>();//bos list

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                boslist1.add(arr[i][j]);


            }

        }
        System.out.println("boslist1 = " + boslist1);// sıralama öncesi

        Collections.sort(boslist1);//sıralandı

        System.out.println("boslist1 = " + boslist1);//sıralama sonrası




    }
}
