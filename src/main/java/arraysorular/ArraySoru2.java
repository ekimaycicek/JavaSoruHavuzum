package arraysorular;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru2 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");
        int arrBoyut=sc.nextInt();

        int arr[]=new int[arrBoyut];
        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ".index elemanı giriniz : ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        Arrays.sort(arr);// k->b sıralandı

        for (int i = arr.length-1 ; i>=0 ; i--) {
            System.out.println("arr[i] = " + arr[i]);

        }

    }
}
