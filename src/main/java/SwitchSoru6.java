import java.util.Scanner;

public class SwitchSoru6 {

    public static void main(String[] args) {


        /*
        * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java kolaydir
              B'yi secmis ise, ==> Java eglencelidir
              C'yi secmis ise, ==> ders calismam lazim :)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("harf seçiniz");
        char harf = sc.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'A':
                System.out.println("java kolaydir");
                break;
            case 'B':
                System.out.println("java eglencelidir");
                break;
            case 'C':
                System.out.println("ders calismam lazim");
                break;
            default:
                System.out.println("hatalı giris");


        }
    }}
