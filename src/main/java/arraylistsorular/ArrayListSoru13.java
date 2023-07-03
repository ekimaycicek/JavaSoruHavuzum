package arraylistsorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSoru13 {


     /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {

        ArrayList<String> renk=new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1="blue";
        String s2="yellow";
        changeInArrayList(renk, s1, s2);
    }



    private static void changeInArrayList(ArrayList<String> renk , String s1 , String s2) {

        for (int i = 0; i <renk.size() ; i++) {
            if (renk.get(i).contains(s1)){
                s2=s1;

            }
        }

        System.out.println("renk = " + renk);
    }
}
