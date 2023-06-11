package arrayListSorular;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSoru7 {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.


        System.out.print("agam kac sayı gireceksin ");


        int sayı= sc.nextInt();
        int sayı1 = 0;
        ortB(sayı,sayı1);





    }

    private static void ortB(int sayı, int sayı1) {
        ArrayList<String> boslist1= new ArrayList<>();
        int toplam=0;
        double ort=toplam/sayı;

        for (int i = 0; i <sayı1; i++) {
            System.out.println(i + ".sayıyı gir");
            sayı1=sc.nextInt();
            sayı1+=i;

            toplam+=i;
        }

        for (int i = 0; i <sayı; i++) {

            if (ort>sayı) {

                boslist1.add(boslist1.get(i));
            }

        }



    }
}
