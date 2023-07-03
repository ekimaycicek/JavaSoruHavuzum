package depoprojesi4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Urunler {

    private int urunId;

    private String urunIsmi;
    private String urunGrubu;
    private String ureticiGrubu;
    private double miktar;
    private String birim;
    private LocalDate sonKullanmaTarihi;
    private String rafNo;

    public Urunler(int urunId, String urunIsmi, String urunGrubu, String ureticiGrubu, double miktar, String birim,
                   LocalDate sonKullanmaTarihi, String rafNo) {
        this.urunId         = urunId;
        this.urunIsmi       = urunIsmi;
        this.urunGrubu      = urunGrubu;
        this.ureticiGrubu   = ureticiGrubu;
        this.miktar         = miktar;
        this.birim          = birim;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
        this.rafNo          = rafNo;
    }

    public int getUrunId() {

        return urunId;
    }

    public void setUrunId(int urunId) {

        this.urunId = urunId;
    }

    public String getUrunIsmi() {

        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {

        this.urunIsmi = urunIsmi;
    }

    public String getUrunGrubu() {

        return urunGrubu;
    }

    public void setUrunGrubu(String urunGrubu) {

        this.urunGrubu = urunGrubu;
    }

    public String getUreticiGrubu() {

        return ureticiGrubu;
    }

    public void setUreticiGrubu(String ureticiGrubu) {

        this.ureticiGrubu = ureticiGrubu;
    }

    public double getMiktar() {

        return miktar;
    }

    public void setMiktar(double miktar) {

        this.miktar = miktar;
    }

    public String getBirim() {

        return birim;
    }

    public void setBirim(String birim) {

        this.birim = birim;
    }

    public LocalDate getSonKullanmaTarihi() {

        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {

        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    public String getRafNo() {

        return rafNo;
    }

    public void setRafNo(String rafNo) {

        this.rafNo = rafNo;
    }

}

