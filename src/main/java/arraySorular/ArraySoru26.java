package arraySorular;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru26 {

    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");
        int arr[]=new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".index elemanı giriniz : ");
            arr[i]=sc.nextInt();
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==1){
                System.out.println("arr[i] = " + arr[i]);
            }




        }
    }
}
