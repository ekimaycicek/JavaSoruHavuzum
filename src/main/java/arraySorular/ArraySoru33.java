package ArraysSorular;

public class Arrays33 {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int arr[]={25,30,30,35,100};
        int str=0;
        for (int i = 0; i < arr.length ; i++) {

            str += arr[i];

        }
        System.out.println(str);


    }

}
