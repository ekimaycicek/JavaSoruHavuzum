package methodcreationsorular;
import java.util.Scanner;
public class MethodCreationSoru2 {

    public static void main(String[] args) {
        // task-- girilen ad ve soyadın ilk harfleri büyük diğerlerini küçük yapan method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("ad giriniz: ");
        String a= sc.nextLine();
        System.out.println("soyad giriniz: ");
        String b=sc.nextLine();



        bykKck(a,b);






    }//**** main sonuuuuuu*******

    private static void bykKck(String a, String b) {

        a=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        b=b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();

        System.out.println(a + " " + b);
    }



}
