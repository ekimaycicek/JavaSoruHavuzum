import java.util.Scanner;

public class LoopSoru5 {

    public static void main(String[] args) {

        //girilen bir String'deki rakam sayısını hesaplayan method yazınız


        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz");
        String str=sc.nextLine();
        int rakam=0;
        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                rakam++;

            }
        }System.out.println("Girilen cümlede : "+rakam+" adet rakam vardır. ");
    }

}





