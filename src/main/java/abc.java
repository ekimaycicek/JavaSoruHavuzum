import java.util.Scanner;

public class abc {

    public static void main(String[] args) {

        //Kullanıcıdan bir array (dizi) boyutu girmesini isteyin.
//array (dizi) boyutunu kullanarak bir array (dizi) oluşturun.
//Kullanıcıdan array (dizi) elemanlarını girmesini isteyin.
//array (dizi) içindeki en büyük ve en küçük sayıları bulun
//en büyük ve en küçük sayılarının toplamını dizideki tek eleman sayısına bölün

        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu gir agam ");
        int size = input.nextInt();

        int[] arr=new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print((i + 1) + " elemanı gir agam ");
            arr[i] = input.nextInt();
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        int toplam = minimum + maximum;
        double sonuc = (double) toplam / size;

        System.out.println("Sonuç: " + sonuc);

    }
    }

