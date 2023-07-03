package NesetErtasFanClub;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NesetErtasFanClub {

        public static void main(String[] args) {
            Map<String, String> sarkilar = new HashMap<>();


            sarkilar.put("Yalan Dünya", "1962");
            sarkilar.put("Ahirim Sensin", "1964");
            sarkilar.put("Gönül Dağı", "1967");
            sarkilar.put("Kara Gözlüm", "1968");
            sarkilar.put("Koca Arap Zeybegi", "1971");
            sarkilar.put("Yazımı Kışa Çevirdin", "1974");
            sarkilar.put("Boşvermişim Dünyaya", "1978");
            sarkilar.put("Gönül Yarası", "1981");
            sarkilar.put("Bir Gönüle Aşk Girince", "1984");
            sarkilar.put("Ömrüm", "1988");
            sarkilar.put("Aşkın Aldı Benden Beni", "1992");
            sarkilar.put("Neredesin Sen", "1995");
            sarkilar.put("Dostum Dostum", "1998");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ne yapmak istersiniz?");
            System.out.println("1. Neşet Ertaş Hayatı");
            System.out.println("2. Müzik Listesi");

            int secim = scanner.nextInt();

            if (secim == 1) {
                nesetErtaşHayati();
            } else if (secim == 2) {
                muzikListesi(sarkilar);
            } else {
                System.out.println("Geçersiz bir seçim yaptınız.");
            }

            scanner.close();
        }

    public static void nesetErtaşHayati() {
        System.out.println("Neşet Ertaş'ın hayatı hakkında bilgiler:");
        System.out.println("Neşet Ertaş, Türk Halk Müziği'nin önemli isimlerinden biridir.");
        System.out.println("1938 yılında Kırtıllar Köyü, Kırşehir'de doğmuştur.");
        System.out.println("Müziğe olan ilgisi çocukluk yıllarında başlamış ve saz çalmayı öğrenmiştir.");
        System.out.println("Geleneksel Türk halk müziği tarzında pek çok başarılı eser bestelemiştir.");
        System.out.println("Seslendirdiği birçok şarkıya kendi yorumunu katarak benzersiz bir tarz oluşturmuştur.");
        System.out.println("Türk halk müziğine yaptığı katkılar ve özgün tarzı ile tanınmış ve sevilmiştir.");
        System.out.println("Neşet Ertaş, 25 Eylül 2012 tarihinde vefat etmiştir, ancak eserleri ve müziği hala yaşamaktadır.");
    }


    public static void muzikListesi(Map<String, String> sarkilar) {

            for (Map.Entry<String, String> entry : sarkilar.entrySet()) {
                String sarki = entry.getKey();
                String tarih = entry.getValue();
                System.out.println(sarki + " - " + tarih);
            }
        }
    }

