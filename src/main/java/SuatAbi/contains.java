package SuatAbi;

public class contains {

    public static void main(String[] args) {

        //Verilen String’in istenen karakterleri içerip içermediğini kontrol eder. İçeriyorsa TRUE, içermiyorsa FALSE döndürür.

        String a = "Tek Rakibim Dünkü Ben";
        boolean varMi=a.contains("bim");
        System.out.println("varMi = " + varMi);//varmi = true
        System.out.println(a.contains("bim"));//true

    }
}
