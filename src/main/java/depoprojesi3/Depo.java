package depoprojesi3;

import java.util.List;
import java.util.Map;

public class Depo {

    private Map<Integer, String> tumUrunler;
    private List<String> listelenenUrunler;
    private List<String> ureticiler;
    private List<String> raflar;

    public Depo(){

        stokYonetimi();

        urunGirisi();

        urunuRafaKoy();

        urunCikisi();

        generatId();

        rafKontrolu();

        tumUrunler();

        giris();



    }

    private void giris() {
        while (true){
            System.out.println(" * * Yakamoz Sarkuteri Urun Yonetim Sistemine * * \n"
                    +"\t\t* HOSGELDINIZ \t\t\n"
                    +"\t\t LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN \t\t*\n");
            System.out.println("\t1- Urun Girisi\n"
                    +"\t2- Urun Listesi\n"
                    +"\t3- Raf Kontrolu\n"
                    +"\t4- Urunu Rafa Koy\n"
                    +"\t5- Stok Kontrol\n"
                    +"\t6- Urun Cikisi\n"
                    +"\t7- CIKIS");
        }



    }

    private void tumUrunler() {
        System.out.println(tumUrunler);
    }

    private void rafKontrolu() {
    }

    private int urunIdCounter=1000;
    private int generatId() {
        int urunId = urunIdCounter;
        urunIdCounter += 10;
        return urunIdCounter;
    }

    private void urunCikisi() {
    }

    private void urunuRafaKoy() {
    }

    private void urunGirisi() {
        System.out.println("Sistemde kayitli tum urunler.");
        tumUrunler();

    }

    private void stokYonetimi() {
    }


}




