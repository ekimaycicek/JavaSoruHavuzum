package methodCreationSorular;
import java.util.Scanner;
public class MethodCreationSoru5 {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

		/* Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

		 */


        System.out.println("üçgen için: \ndikdörtgen için: \nkare için:  seçiniz" );
        String secim=sc.nextLine();
        System.out.println("sayı1 seciniz: \nsayı2 seciniz: ");
        int sayı1= sc.nextInt();
        int sayı2= sc.nextInt();


        secim(secim,sayı1,sayı2);


    }// *** main sonu ***






    public static  void secim(String sekil, int sayı1, int sayı2 ){
        switch (sekil) {
            case "ücgen":

                System.out.println("ücgen yüksekliği giriniz: ");
                int h=sc.nextInt();

                cevreÜ( sayı1 , sayı2);


                alanÜ(sayı1,h);
                break;


            case "dikdörtgen":

                cevreD( sayı1 , sayı2);


                alanD(sayı1,sayı2);
                break;
            case "kare":


                cevreK( sayı1 , sayı2);


                alanK(sayı1,sayı2);

                break;
            default:
                System.out.println("hatalı giriş");


        }

    }

    private static void alanD(int sayı1, int sayı2) {
        System.out.println("alanD: " + ((sayı1*sayı2)));
    }

    private static void cevreD(int sayı1, int sayı2) {
        System.out.println("cevreD: " + ((sayı1+sayı2)*2));
    }

    private static void cevreÜ(int sayı1, int sayı2) {
        System.out.println("cevreÜ: " + ((sayı1+sayı2)));
    }

    private static void alanÜ(int sayı1, int h) {
        System.out.println("alanÜ: " + ((sayı1* h )/2));
    }

    private static void alanK(int sayı1, int sayı2) {
        System.out.println("alanK: " + ((sayı1*sayı2)));
    }

    private static void cevreK(int sayı1, int sayı2) {
        System.out.println("cevreK: " + ((sayı1+sayı2)*2));
    }

}
