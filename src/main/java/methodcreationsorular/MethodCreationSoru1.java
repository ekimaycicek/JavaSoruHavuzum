package methodcreationsorular;

import java.util.Scanner;

public class MethodCreationSoru1 {

    public static void main(String[] args) {
        // task-- girilen iki sayının esitliğini kontrol eden method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("1.sayı giriniz: ");
        int a= sc.nextInt();
        System.out.println("2.sayı giriniz: ");
        int b=sc.nextInt();

        System.out.println(esitKontrol(a, b));
        System.out.println(esitKontrol(3, 5));
        System.out.println(esitKontrol(33, 33));
        esitKontrol2(61,61);
        esitKontrol2(a,b);







    }

    public static boolean esitKontrol(int a, int b) {

        boolean esitMi=false;

        if(a==b){
            esitMi=true;
        }else esitMi=false;


        return esitMi;
    }

    public static void esitKontrol2(int x, int y){

        if (x==y){
            System.out.println("sayılar esit");

        }else System.out.println("sayılar esit değil");
    }

}
