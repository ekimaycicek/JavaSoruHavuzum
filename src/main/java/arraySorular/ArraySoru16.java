package arraySorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySoru16 {

    public static void main(String[] args) {

 /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan kodu yaziniz.
    */


        ArrayList<Integer> listsayı = new ArrayList<>(Arrays.asList(24,23,14,19,60,55,27,38));
        ArrayList<Integer> boslist1= new ArrayList<>();


        int carpım=0;
        int toplam=0;
        for (int i = 0; i < listsayı.size() ; i++) {

            carpım= (listsayı.get(i) * listsayı.get(i));


            boslist1.add(carpım);

        }
        System.out.println("boslist1 = " + boslist1);

        for (int i = 0; i < boslist1.size(); i++) {

            toplam+=boslist1.get(i);

        }

        System.out.println("toplam = " + toplam);

    }
}
