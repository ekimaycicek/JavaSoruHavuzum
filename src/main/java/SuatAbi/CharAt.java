package SuatAbi;

public class CharAt {

    public static void main(String[] args) {


        //*****charAt****
        //Verilen String’in istenen indexteki karakteri (char) döndürür.
        //Index 0’dan başlar, maximum index (String’in uzunluğu -1)’dir.
        //Eğer method’da index olarak maximum indexden büyük bir sayı kullanılırsa JAVA hata verir.

        String sehir="Istanbul";
        char besinciindexkrktr = sehir.charAt(5);
        System.out.println(besinciindexkrktr);
    }
}
