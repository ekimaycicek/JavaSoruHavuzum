import java.util.Scanner;

public class DoWhile3 {

    public static void main(String[] args) {

         /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı = sc.nextInt();
        int count=0;
        while (sayı>0){
            if (sayı%2!=0){
                System.out.println(sayı+" ");
                count++;

            }

            sayı--;

        }System.out.println("girilen sayı = " + count);
    }
}
