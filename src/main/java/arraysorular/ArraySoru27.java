package arraysorular;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru27 {

    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");

        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".index elemanı giriniz : ");
            arr[i] = sc.nextInt();
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        }

        for (int i = arr.length-1 ; i >=0 ; i--) {



        }   System.out.println("arr = " + arr);

    }
}
