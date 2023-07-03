package replitsorular;

public class ForLoopSoru6 {

    /*
    Konsolda Alfabeyi Yazdıran programi yaziniz.

OUTPUT  :

a b c .. .. .. .. y z

     */

        public static void main(String[] args) {
            System.out.println("For döngüsü ile alfabeyi yazdırma:");
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
            }



            System.out.println();

            System.out.println("While döngüsü ile alfabeyi yazdırma:");
            char alfabe = 'a';
            while (alfabe <= 'z') {
                System.out.print(alfabe + " ");
                alfabe++;
            }
        }
    }


