package arraylistsorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSoru11 {

     /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> sayıList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("sayıList = " + sayıList);

        System.out.println("getSum(sayıList) = " + getSum(sayıList));


    }

    private static int getSum(ArrayList<Integer> sayıList) {
        int toplam=0;
        for (int i = 0; i <sayıList.size(); i++) {
            toplam+=i;
        }

        return toplam;
    }
}
