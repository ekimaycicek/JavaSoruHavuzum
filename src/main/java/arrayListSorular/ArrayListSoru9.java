package arrayListSorular;

import java.util.Arrays;

public class ArrayListSoru9 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        Arrays.sort(arr);

        String arrayString = Arrays.toString(arr);// array i stringe çevirdik
        System.out.println(arrayString); // [10,25,3,16,75] yazdırdık

        String result = "";

        for (int i = 1; i < arrayString.length(); i++){
            if (i==(arrayString.charAt(i))){
                arrayString.replaceAll("i","");



            }


        }

        System.out.println("arrayString = " + arrayString);

    }
}
