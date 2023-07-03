package depoprojesi;

import java.time.LocalDate;

public class Urun {

        private int urunId;
        private int urunMiktar;
        private String urunIsmi;
        private String uretici;
        private String raf;
        private String birim;


        public Urun(int urunId, int urunMiktar, String urunIsmi, String uretici, String raf, String birim) {

            this.urunId = urunId;
            this.urunMiktar = urunMiktar;
            this.urunIsmi = urunIsmi;
            this.uretici = uretici;
            this.raf = raf;
            this.birim = birim;        }

    public Urun(int urunId, String urunIsmi, String urunGrubu, String uretici, int i, String birim, LocalDate sonKullanmaTarihi, String s) {
    }

    public int getId() {
            return urunId;
        }

        public String getUrunIsmi() {
            return urunIsmi;
        }

        public String getUretici() {
            return uretici;
        }

        public int getMiktar() {
            return urunMiktar;
        }

        public void setMiktar(int urunMiktar) {
            this.urunMiktar = urunMiktar;
        }

        public String getBirim() {
            return birim;
        }

        public String getRaf() {
            return raf;
        }

        public void setRaf(String raf) {
            this.raf = raf;
        }


}


