package ogrencinottakip;

import java.util.ArrayList;

public class NotTakip {

    public static void main(String[] args) {
        ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();

        Ogrenci ogrenci1 = new Ogrenci("Ekim", "Ayçiçek");
        ogrenci1.notEkle(95);
        ogrenci1.notEkle(90);
        ogrenci1.notEkle(85);

        Ogrenci ogrenci2 = new Ogrenci("Ali", "Can");
        ogrenci2.notEkle(35);
        ogrenci2.notEkle(45);
        ogrenci2.notEkle(10);

       ogrenciListesi.add(ogrenci1);
       ogrenciListesi.add(ogrenci2);

        for (Ogrenci ogrenci : ogrenciListesi) {
            System.out.println("Ad: " + ogrenci.getAd());
            System.out.println("Soyad: " + ogrenci.getSoyad());
            System.out.println("Not Ortalaması: " + ogrenci.notOrtalamasiHesapla());
            System.out.println();
        }
        }
    }

