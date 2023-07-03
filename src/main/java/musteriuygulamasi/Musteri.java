package musteriuygulamasi;

public class Musteri {


    /*
Müşteri yönetim uygulaması ile müşterilerin adını, soyadını ve e-posta adresini
takip etmeniz gerekiyor.
 */





    private String ad;
    private String soyad;
    private String eposta;

    public Musteri(String ad, String soyad, String eposta) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getEposta() {
        return eposta;
    }

}
