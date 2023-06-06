import java.util.Scanner;

public class StringManipulationSoru10 {

    public static void main(String[] args) {


        /*
        Girilen string içindeki istenen index'deki karakteri print eden kodu yaziniz
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()>index){
            System.out.println(str.charAt(index));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");

    }
}
