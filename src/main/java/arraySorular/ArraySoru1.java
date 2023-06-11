package arraySorular;

import java.util.Arrays;

public class ArraySoru1 {

    public static void main(String[] args) {

		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int arrSayı[] = new int[3];
        int yeniArr[] = new int[3];
        for (int i = 0; i < arrSayı.length; i++) {
            arrSayı[i] = i;
        }
        System.out.println(Arrays.toString(arrSayı));

        for (int i = 0; i < arrSayı.length; i++) {
            if (i == 0) {
                yeniArr[i] = arrSayı[i + 1];
            } else if (i == arrSayı.length - 1) {
                yeniArr[i] = arrSayı[0];
            } else {
                yeniArr[i] = arrSayı[i + 1];
            }

        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
