package arraysorular;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru2 {


    public static void main(String[] args) {

        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("agam kac elemanlı array istiyirsen: ");

        int arrBoyut=sc.nextInt();// ifadesiyle arr adında bir tamsayı dizisi oluşturulur ve boyutu kullanıcının
        // girdiği arrBoyut değeriyle belirlenir.



        int arr[]=new int[arrBoyut];//arr dizisinin boyutunu belirler. Kullanıcının girdiği arrBoyut değeri,
        // dizinin eleman sayısını belirler.

        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ".index elemanı giriniz : ");

            arr[i]=sc.nextInt();//Kullanıcı bu mesaja bir tam sayı değeri girer ve sc.nextInt() kullanılarak bu değer okunur.

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//Arrays.toString() metodunu kullanarak arr dizisini bir dizeye
        // dönüştürür ve ekrana yazdırır.

        Arrays.sort(arr);//arr dizisini küçükten büyüğe doğru sıralar. Dizinin elemanları artık sıralı bir şekilde yer alır

        for (int i = arr.length-1 ; i>=0 ; i--) {

            System.out.println("arr[i] = " + arr[i]);//Bu şekilde, tersten sıralanmış dizinin elemanları, büyükten küçüğe doğru ekrana yazdırılır.



        }

    }
}
