package ogrenciNotTakip;
import java.util.ArrayList;
public class Ogrenci {

/*
öğrenci not takip uygulaması ile öğrencilerin adını, soyadını ve aldıkları notları takip
 etmeniz gerekiyor.
 */
        private String ad;
        private String soyad;
        private ArrayList<Integer> notlar;

        public Ogrenci(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
            this.notlar = new ArrayList<>();
        }

        public void notEkle(int not) {
            notlar.add(not);
        }

        public double notOrtalamasiHesapla() {
            int toplam = 0;
            for (int not : notlar) {
                toplam += not;
            }
            return (double) toplam / notlar.size();
        }

        public String getAd() {
            return ad;
        }

        public String getSoyad() {
            return soyad;
        }
    }




