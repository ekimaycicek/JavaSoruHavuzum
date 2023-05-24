import java.util.Scanner;

public class LoopSoru2 {

    public static void main(String[] args) {

        //girilen sayıdan 100e kadar 4 ün katı olan tam sayıları print eden kod yazınız

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayı=sc.nextInt();

        if(sayı>100){
            System.out.println("agam düzgün sayı gir");
        }else{
            for (int i = sayı; i <100 ; i++) {
                if (i%4==0){
                    System.out.println(i+" ");
                }

            }

        }
    } }