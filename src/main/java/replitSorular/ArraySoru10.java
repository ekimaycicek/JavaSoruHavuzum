package replitSorular;

public class ArraySoru10 {



        public static void main(String[] args) {

            String cumle = "Java kolaydır";
            String tersCumle = tersKelimeler(cumle);
            System.out.println("Ters: " + tersCumle);
        }

        public static String tersKelimeler(String cumle) {

            String[] kelimeler = cumle.split(" ");
            StringBuilder ters = new StringBuilder();


            for (int i = kelimeler.length - 1; i >= 0; i--) {
                ters.append(kelimeler[i]);
                if (i != 0) {
                    ters.append(" ");
                }
            }
            return ters.toString();
        }
    }


