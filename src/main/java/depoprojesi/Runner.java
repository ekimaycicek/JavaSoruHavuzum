package depoprojesi;

public class Runner {

        public static void main(String[] args) {
            Depo depo = new Depo();

            depo.urunTanimlama(1001, "Çekirdek", "Tadim", 60, Depo.UrunBirimi.GRAM, "RAF-1");
            depo.urunTanimlama(1002, "Leblebi", "Meray", 100, Depo.UrunBirimi.GRAM, "RAF-2");
            depo.urunTanimlama(1003, "Kaju", "Tugba", 250, Depo.UrunBirimi.GRAM, "RAF-3");
            depo.urunTanimlama(1004, "Fıstık", "Kardesler", 400, Depo.UrunBirimi.GRAM, "RAF-4");
            depo.urunTanimlama(1005, "Fındık", "Cadde", 250, Depo.UrunBirimi.GRAM, "RAF-5");
            depo.urunTanimlama(1006, "Antep Fıstığı", "Ucar", 280, Depo.UrunBirimi.GRAM, "RAF-6");
            depo.urunTanimlama(1008, "Badem", "Peyman", 490, Depo.UrunBirimi.GRAM, "RAF-7");
            depo.urunTanimlama(1009, "Ceviz", "Citlio", 180, Depo.UrunBirimi.GRAM, "RAF-8");
            depo.urunTanimlama(1010, "Çam Fıstığı", "Malatya Pazari", 340, Depo.UrunBirimi.GRAM, "RAF-9");
            depo.urunTanimlama(1011, "Kabak Çekirdeği", "Ulker", 320, Depo.UrunBirimi.GRAM, "RAF-10");

            depo.urunListele();

            depo.urunGirisi(1001, 60);
            depo.urunuRafaKoy(1002, "RAF-2");
            depo.urunCikisi(1005, 250);

            depo.urunListele();
        }
    }








