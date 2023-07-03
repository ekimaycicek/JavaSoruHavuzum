package depoprojesi;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Depo {

       private Map<Integer, Urun> urunler;

       private List<String> ureticiler;
    private List<String> urunListesi;

        public Depo() {
            urunler = new HashMap<>();
            ureticiler = new ArrayList<>();
            urunListesi = new ArrayList<>();
            urunListesi.add("Kabuklu Findik");
            urunListesi.add("Tuzlu Findik");
            urunListesi.add("Fistik");
            urunListesi.add("Yer Fistigi");
            urunListesi.add("Kaju");
            urunListesi.add("Badem");
            urunListesi.add("Leblebi");
            urunListesi.add("Kuru Uzum");
            urunListesi.add("Ceviz");
            urunListesi.add("Kabuklu Ceviz");
            urunListesi.add("Antep Fistigi");
            urunListesi.add("Cekirdek");
            urunListesi.add("Atom Karisik");
            urunListesi.add("Kabak Cekirdegi");
            urunListesi.add("Tuzsuz Kabak Cekirdegi");
            urunListesi.add("Cig Badem Ici");
            urunListesi.add("Cekirdek Ici");
            urunListesi.add("Misir");
            urunListesi.add("Soslu Fistik");

            ureticiler = new ArrayList<>();
            ureticiler.add("Tadim");
            ureticiler.add("Meray");
            ureticiler.add("Tugba");
            ureticiler.add("Kardesler");
            ureticiler.add("Cadde");
            ureticiler.add("Ucar");
            ureticiler.add("Nazo");
            ureticiler.add("Peyman");
            ureticiler.add("Citlio");
            ureticiler.add("Malatya Pazari");
            ureticiler.add("Ulker");
            ureticiler.add("Eti");
            ureticiler.add("Phillip Morris");
            ureticiler.add("Japan Tobacco");
        }
    public enum UrunBirimi {
        GRAM("Gram"),
        KG("Kilogram"),
        ADET("Adet"),
        PAKET("Paket");

        private final String birimAdi;

        UrunBirimi(String birimAdi) {
            this.birimAdi = birimAdi;
        }

        public String getBirimAdi() {
            return birimAdi;
        }
    }


    public void urunTanimlama(int urunId, String urunIsmi, String uretici, int urunMiktar, UrunBirimi birim, String raf) {
        Urun urun = new Urun(urunId, urunMiktar, urunIsmi, uretici, raf, birim.getBirimAdi());
        urunler.put(urunId, urun); // urunu urunler map'ine eklemeyi unutma
    }

    public void urunListele() {
        System.out.println("id\tismi\t\turetici\t\tmiktari\t\tbirimi\t\traf");
        System.out.println("--------------------------------------------------------------");
        for (Urun urun : urunler.values()) {
            System.out.printf("%d\t%-15s\t%-15s\t%d\t\t%s\t\t%s%n", urun.getId(), urun.getUrunIsmi(),
                    urun.getUretici(), urun.getMiktar(), urun.getBirim(), urun.getRaf() != null ? urun.getRaf() : "-");
        }
        System.out.println();
    }




    public void urunGirisi(int urunId, int girisMiktari) {

            if (urunler.containsKey(urunId)) {
                Urun urun = urunler.get(urunId);
                int yeniMiktar = urun.getMiktar() + girisMiktari;
                urun.setMiktar(yeniMiktar);
                System.out.println("Urun girisi yapildi.");
            } else {
                System.out.println("Girdiginiz ID'ye sahip bir urun bulunamadi.");
            }
            System.out.println();
        }


        public void urunuRafaKoy(int urunId, String raf) {

            if (urunler.containsKey(urunId)) {
                Urun urun = urunler.get(urunId);
                urun.setRaf(raf);
                System.out.println("Urun rafa koyuldu.");
            } else {
                System.out.println("Girdiginiz ID'ye sahip bir urun bulunamadi.");
            }
            System.out.println();
        }


        public void urunCikisi(int urunId, int cikisMiktari) {
            if (urunler.containsKey(urunId)) {
                Urun urun = urunler.get(urunId);
                int mevcutMiktar = urun.getMiktar();
                if (mevcutMiktar >= cikisMiktari) {
                    int kalanMiktar = mevcutMiktar - cikisMiktari;
                    urun.setMiktar(kalanMiktar);
                    System.out.println("Urun cikisi yapildi.");
                } else {
                    System.out.println("Girdiginiz miktar, mevcut miktardan fazla.");
                }
            } else {
                System.out.println("Girdiginiz ID'ye sahip bir urun bulunamadi.");
            }
            System.out.println();
        }


    }
