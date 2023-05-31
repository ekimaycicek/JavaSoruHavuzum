import java.util.ArrayList;
import java.util.Arrays;

public class Arrays20 {

    public static void main(String[] args) {

        /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

            ArrayList<String> sehirList=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

            getLength(sehirList);


        }

        private static int getLength(ArrayList<String> sehirList) {

            for (int i = 0; i <sehirList.size() ; i++) {
                System.out.println("sehirList.get(i).length() = " + sehirList.get(i).length());
            }
            return 0;
    }
}
