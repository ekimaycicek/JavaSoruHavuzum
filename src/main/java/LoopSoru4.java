import java.util.Scanner;

public class LoopSoru4 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
          hesaplayan kodu yazın
          Örnek Ekran Çıktısı
        Girilen sayı=4
       Kareler toplamı=14
             */


        Scanner sc=new Scanner(System.in);
        System.out.println("1 den büyük sayı giriniz: ");
        int sayı=sc.nextInt();
        int toplam=0;
        for (int i = 1; i <sayı ; i++) {
            toplam+=(i*i);



        } System.out.println("toplam = " + toplam);

    }
    }

