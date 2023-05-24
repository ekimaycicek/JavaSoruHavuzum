import java.util.Scanner;

public class LoopContinue {

    public static void main(String[] args) {

/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden kodu yazınız

        Scanner sc = new Scanner(System.in);
        System.out.println("mail giriniz: ");
        String mail = sc.nextLine();


        for (int i = 0; i < mail.length(); i++) {
            char c = mail.charAt(i);
            if (c == ' ') {
                continue;
            } System.out.print(c);
        }


    }
}
