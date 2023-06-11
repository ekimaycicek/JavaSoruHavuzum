package arrayListSorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSoru10 {

     /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {


        System.out.println("getCount() = " + getCount(

        ));


    }

    private static int getCount() {
        ArrayList<String> meyve=new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        String Orange;
        int count=0;


        for (int i = 0; i <meyve.size() ; i++) {

            if (meyve.get(i) == "Orange"){
                count++;

            }

        }

        return count;
    }
}
