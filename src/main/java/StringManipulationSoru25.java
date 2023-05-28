import java.util.Scanner;

public class StringManipulationSoru25 {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz:");
        String str=sc.nextLine();

        if (str.contains(" ")){
            System.out.println("bosluk var");
        }


        if (str.equals("")){

            System.out.println("str boş");
        }else System.out.println("str bos değil");
    }
}
