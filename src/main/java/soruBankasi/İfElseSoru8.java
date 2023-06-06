package SoruBankasi;

import java.util.Scanner;

public class İfElseSoru8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif inteğer giriniz");
        int a = scan.nextInt();

        if(a>9 && a<100) {
            System.out.println("Elma");
        }
        if(a>99 && a<1000) {
            System.out.println("Armut"); }
        if(!(a>99 && a<1000) && !(a>9 && a<100)) {
            System.out.println("Karpuz");
        }
    }
}
