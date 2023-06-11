package musteriUygulamasi;

import java.util.ArrayList;

public class MusteriYönetimi {

    public static void main(String[] args) {
        ArrayList<Musteri> müşteriListesi = new ArrayList<>();

        Musteri müşteri1 = new Musteri("Ekim", "Aycicek", "ekim@gmail.com");
        Musteri müşteri2 = new Musteri("Ali Can", "Canyakan", "alican@gmail.com");
        Musteri müşteri3 = new Musteri("Mehmet", "Kaya", "mehmet@gmail.com");

        müşteriListesi.add(müşteri1);
        müşteriListesi.add(müşteri2);
        müşteriListesi.add(müşteri3);

        for (Musteri müşteri : müşteriListesi) {
            System.out.println("Ad: " + müşteri.getAd());
            System.out.println("Soyad: " + müşteri.getSoyad());
            System.out.println("E-posta: " + müşteri.getEposta());
            System.out.println();
        }
    }
}
