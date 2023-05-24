import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {

        //task->girilen bir metinde harf rakam ve özel karakter sayısını print eden kodu yazınız

        Scanner sc = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = sc.nextLine();
        int countHarf = 0;
        int countSayı = 0;
        int countOzel = 0;
        int index = 0;

        do {

            if (metin.charAt(index) >= '0' && metin.charAt(index) <= '9') {

                countSayı++;
            } else if (metin.toLowerCase().charAt(index) >= 'a' && metin.toLowerCase().charAt(index) <= 'z') {
                countHarf++;
            } else countOzel++;

            index++;




        }
        while (index<metin.length());

        System.out.println("countHarf = " + countHarf);
        System.out.println("countSayı = " + countSayı);
        System.out.println("countOzel = " + countOzel);

    }
}
