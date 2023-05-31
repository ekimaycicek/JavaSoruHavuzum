import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {

    public static void main(String[] args) {

        // bir listte istenen sayının varlığını kontrol eden kodu yaziniz

        ArrayList<Integer> listsayı = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner sc = new Scanner(System.in);
        System.out.println("hangi sayıyı arıyorsunuz: ");
        int sayı= sc.nextInt();

        boolean varMı= false;

        for (int i = 0; i <listsayı.size() ; i++) {
            if (listsayı.get(i)==sayı){
                varMı= true;
                System.out.println("aradıgın sayı bizde mevcut");
                break;

            }

        }
        if (!varMı){
            System.out.println("aranan bulunamadı");
        }





    }
}
