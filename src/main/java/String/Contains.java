package String;
import java.util.Scanner;
public class Contains {


    public static void main(String[] args) {

            /*
        String içersinde istene stringini varlığını kontrol eder boolean return eder..

         */
        String s1="enise hanım basarılı bir qa tester team lead";
        System.out.println(s1.contains("hanım var mı")); //false
        System.out.println(s1.contains("e"));//true
        System.out.println(s1.contains(" "));//true


        String s2="qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false

        // task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız

        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz");

        String cümle=sc.nextLine();




        System.out.println(cümle.contains("ahmet") ? "var": "yok");


    }


}
