package arraysorular;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySoru11 {

    public static void main(String[] args) {

       /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan kodu yaziniz.
         */

        Scanner sc = new Scanner(System.in);// kullanıcıdan veri alındı
        ArrayList<Integer> notList = new ArrayList<>();// bos list acıldı
        ArrayList<Integer> ortnotList = new ArrayList<>();// bos list acıldı

        System.out.println("canım kac tane not gireceksin: ");

        int notsayısı = sc.nextInt();
        int toplam = 0;
        int ortüstü=0;

        for (int i = 0; i < notsayısı; i++) {
            System.out.println(i + ". notu giriniz");
            int not = sc.nextInt();
            // int ort = toplam /not;
            toplam += not;
            notList.add(not);

        }
        System.out.println("toplam = " + toplam);
        System.out.println("notList = " + notList);

        for (int i = 0; i < notList.size(); i++) {

            if (ortüstü > (toplam / notList.size())) {

                ortüstü+=i;

                ortnotList.add(ortüstü);

            }



        } System.out.println("ortnotList = " + ortnotList);
    }
}
