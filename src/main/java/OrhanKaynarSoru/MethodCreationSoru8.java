package OrhanKaynarSoru;

public class MethodCreationSoru8 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        int saat=2;
        int saniye=saat*3600;
        System.out.println(cevir(saat));


    }// *** main sonu ***
    public static int cevir(int saat){


        return saat*3600;
    }

}
