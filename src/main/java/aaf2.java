import java.util.Scanner;

public class aaf2 {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");


        int sayi=scan.nextInt();

        if (sayi%10==0){
            System.out.println("Hatali");
        }
        while (sayi%10!=0){
            System.out.print(sayi+" ");
            sayi++;
        }


    }
}
