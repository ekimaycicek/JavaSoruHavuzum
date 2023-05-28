package SuatAbi;

public class endsWith {

    public static void main(String[] args) {


        //Verilen String'in istenen karakterler ile bitip bitmediğini kontrol eder. İstenen karakterler ile bitiyorsa TRUE, yoksa

        String s = "Learn Java earn money";


        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true
    }
}
