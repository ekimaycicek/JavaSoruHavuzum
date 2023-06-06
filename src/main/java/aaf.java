import java.util.Scanner;

public class aaf {

    public static void main(String[] args) {


        Scanner inp=new Scanner(System.in);
        System.out.println("sayı gir");

        int sayi= inp.nextInt();
        int carp=1;


        int ilk=1;

        while (ilk<=sayi){

            carp=ilk*carp;

            ilk++;
        }


        System.out.println(sayi+"! = "+carp);
    }
}
