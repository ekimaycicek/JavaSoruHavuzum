import java.util.Arrays;

public class a3 {

    public static void main(String[] args) {


        String aaa ="$1 $12 €34 €56 $45 €78";

        String [] arr = aaa.split(" ");
        System.out.println(Arrays.toString(arr));

        int euroToplami = 0;
        int dolarToplami = 0;

        for (String w : arr){

            if (w.startsWith("€")){
                int euroDegeri = Integer.parseInt(w.substring(1));
                euroToplami += euroDegeri;

            } else if (w.startsWith("$")){
                int dolarDegeri = Integer.parseInt(w.substring(1));
                dolarToplami += dolarDegeri;
            }
        }

        System.out.println("Euro:" + euroToplami);
        System.out.println("Dolar: " + dolarToplami);

    }

}
