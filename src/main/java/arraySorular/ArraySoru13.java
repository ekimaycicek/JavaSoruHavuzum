package arraySorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySoru13 {

    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir kodu yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        ArrayList<String> list1= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> boslist1= new ArrayList<>();// bos list

        for (int i = 0; i <list1.size() ; i++) {
            if (!list1.get(i).toLowerCase().contains("a")){ // listin her bir elemanı a bulundurmuyorsa
                boslist1.add(list1.get(i));// boslist1 a olmayan eleman eklendi

            }

        }
        System.out.println("boslist1 = " + boslist1);

        list1.clear();//list ısım boşlatılıdı

        list1.addAll(boslist1);
        System.out.println("list1 = " + list1);//listIsim = [Veli, Omer]


    }
}
