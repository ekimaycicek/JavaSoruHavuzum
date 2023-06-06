import java.util.Scanner;

public class aaaa11111 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("satir sayısını gir");
        int satir= scan.nextInt();

        int x=1;

        for (int i = 0; i <satir ; i++) {


            for (int j = 0; j <=i ; j++) {
                System.out.print(x+" ");
                x++;
            }

            System.out.println();
        }}}
