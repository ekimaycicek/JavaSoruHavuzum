package stringManipulationSorular;

import java.util.Scanner;

public class StringManipulationSoru3 {

    public static void main(String[] args) {

        //TASK : Kullanicidan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String s=sc.nextLine();

        if(s.contains(" ")){
            System.out.println("boşluk var");

        }else System.out.println("boşluk yok");




    }
}
