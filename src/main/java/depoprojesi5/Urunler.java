package depoprojesi5;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Urunler {
    private int urunId;
    private String urunIsmi;
    private String urunGrubu;
    private String ureticiGrubu;
    private int miktar;
    private String birim;
    private LocalDate sonKullanmaTarihi;
    private String rafNo;

    public Urunler(int urunId, String urunIsmi, String urunGrubu, String ureticiGrubu, int miktar, String birim, LocalDate sonKullanmaTarihi, String rafNo) {
        this.urunId = urunId;
        this.urunIsmi = urunIsmi;
        this.urunGrubu = urunGrubu;
        this.ureticiGrubu = ureticiGrubu;
        this.miktar = miktar;
        this.birim = birim;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
        this.rafNo = rafNo;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    public LocalDate getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getUrunGrubu() {
        return urunGrubu;
    }

    public void setUrunGrubu(String urunGrubu) {
        this.urunGrubu = urunGrubu;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUreticiGrubu() {
        return ureticiGrubu;
    }

    public void setUreticiGrubu(String ureticiGrubu) {
        this.ureticiGrubu = ureticiGrubu;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunId=" + urunId +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", urunGrubu='" + urunGrubu + '\'' +
                ", ureticiGrubu='" + ureticiGrubu + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", sonKullanmaTarihi=" + sonKullanmaTarihi +
                ", rafNo='" + rafNo + '\'' +
                '}';
    }
}
