package depoprojesi5;

import depoprojesi.Urun;

import java.time.LocalDate;
import java.util.*;

public class Depo {
    private List<String> listelenenUrunler;
    private Map<Integer, String> tumUrunler;
    private List<String> raflar;
    private List<String> ureticiler;
    static Scanner scanner = new Scanner(System.in);

    public Depo() {
        listelenenUrunler = new ArrayList<>();
        tumUrunler = new HashMap<>();
        ureticiler = new ArrayList<>();
        raflar = new ArrayList<>();

        giris();
    }

    public void giris() {
        while (true) {
            System.out.println(" * * Yakamoz Sarkuteri Urun Yonetim Sistemine * * ");
            System.out.println("\t\t\t* HOSGELDINIZ \t\t\t");
            System.out.println("\t\t LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN \t\t");
            System.out.println();
            System.out.println("1- Urun Girisi");
            System.out.println("2- Urun Listesi");
            System.out.println("3- Raf Kontrolu");
            System.out.println("4- Urunu Rafa Koy");
            System.out.println("5- Stok Kontrol");
            System.out.println("6- Urun Cikisi");
            System.out.println("7- CIKIS");

            String secimStr = scanner.next();

            switch (secimStr) {
                case "1":
                    urunGirisi();
                    break;
                case "2":
                    tumUrunler();
                    break;
                case "3":
                    rafKontrolu();
                    break;
                case "4":
                    urunuRafaKoy();
                    break;
                case "5":
                    stokYonetimi();
                    break;
                case "6":
                    urunCikisi();
                    break;
                case "7":
                    System.out.println("Sistemden çıkılıyor...");
                    return;
                default:
                    System.out.println("Hatalı bir seçim yaptınız. Lütfen tekrar deneyin.");
                    break;
            }
        }
    }








    private void rafKontrolu() {
        System.out.println("Raf Kontrolü:");
        System.out.println("Mevcut raflar:");

        for (String raf : raflar) {
            System.out.println(raf);
        }
    }

    private void tumUrunler() {
        System.out.println("Tüm Ürünler");

        // Grupları saklamak için bir Set kullanalım
        Set<String> gruplar = new HashSet<>();

        // Tüm ürünlerin gruplarını gruplar Set'ine ekleyelim
        for (String urun : tumUrunler.values()) {
            String[] urunBilgileri = urun.split("-");
            gruplar.add(urunBilgileri[2]);
        }

        // Her bir grup için ürünleri listeleyelim
        for (String grup : gruplar) {
            System.out.println("Grup: " + grup);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("ID\tÜrün Adı\tÜretici\t\tMiktar\tBirim\tRaf");
            System.out.println("-----------------------------------------------------------------------------");

            for (String urun : tumUrunler.values()) {
                String[] urunBilgileri = urun.split("-");
                if (urunBilgileri[2].equals(grup)) {
                    int urunId = Integer.parseInt(urunBilgileri[0]);
                    String urunIsmi = urunBilgileri[1];
                    String uretici = urunBilgileri[2];
                    int miktar = Integer.parseInt(urunBilgileri[4]);
                    String birim = urunBilgileri[5];
                    String raf = urunBilgileri[6];

                    System.out.printf("%d\t%-15s\t%-15s\t%d\t%s\t%s%n", urunId, urunIsmi, uretici, miktar, birim, raf != null ? raf : "-");
                }
            }
        }
    }



    private int urunIdCounter = 1000;

    private int generatId() {
        int urunId = urunIdCounter;
        urunIdCounter += 10;
        return urunIdCounter;
    }

    private void urunCikisi() {
        System.out.println("Ürün Çıkışı");

        System.out.print("Ürün ID'sini girin: ");
        int urunId = scanner.nextInt();
        scanner.nextLine();

        if (tumUrunler.containsKey(urunId)) {
            String urun = tumUrunler.get(urunId);

            System.out.print("Çıkış Miktarını girin: ");
            int cikisMiktari = scanner.nextInt();
            scanner.nextLine();

            if (cikisMiktari > 0) {
                if (listelenenUrunler.contains(urun)) {
                    // Ürün stokta mevcut, çıkış miktarını güncelle
                    int stokMiktari = Integer.parseInt(urun.split("-")[3]);
                    if (cikisMiktari <= stokMiktari) {
                        stokMiktari -= cikisMiktari;
                        urun = urun.replaceFirst("-\\d+-", "-" + stokMiktari + "-");
                        System.out.println(cikisMiktari + " adet " + urun + " ürünü stoktan çıkarıldı.");
                    } else {
                        System.out.println("Stokta yeterli ürün bulunmamaktadır. Çıkış işlemi gerçekleştirilemedi.");
                    }
                } else {
                    System.out.println("Ürün stokta bulunmamaktadır. Çıkış işlemi gerçekleştirilemedi.");
                }
            } else {
                System.out.println("Hatalı bir miktar girdiniz. Lütfen pozitif bir değer girin.");
            }
        } else {
            System.out.println("Girilen ID'ye sahip bir ürün bulunamadı.");
        }
    }

    private void urunuRafaKoy() {
        System.out.println("Ürünü Rafa Koyma");

        System.out.print("Ürün ID'sini girin: ");
        int urunId = scanner.nextInt();
        scanner.nextLine();

        if (tumUrunler.containsKey(urunId)) {//bu sözlükte urunId anahtarının olup olmadığı kontrol ediliyor.
            // Eğer anahtar varsa, bloğa girilir.
            String urun = tumUrunler.get(urunId);//urun adlı bir dize (string) değişkeni tanımlanıyor ve urunId
            // anahtarına karşılık gelen değeri tumUrunler sözlüğünden alıyor.

            System.out.print("Raf numarasını girin: ");
            String raf = scanner.nextLine();

            //urunId anahtarına sahip değeri, urun değişkeninin içindeki "-\d+-" kalıbını "-raf-" ile değiştirerek
            // güncellenmiş bir değerle tumUrunler sözlüğüne (Map) tekrar yerleştiriyor.
            tumUrunler.put(urunId, urun.replaceFirst("-\\d+-", "-" + raf + "-"));
            System.out.println("Ürün rafa başarıyla yerleştirildi.");
        } else {
            System.out.println("Girilen ID'ye sahip bir ürün bulunamadı.");
        }
    }

    private void urunGirisi() {
        System.out.println("Ürün Girişi");

        System.out.print("Ürün Adı: ");
        String urunIsmi = scanner.nextLine();

        System.out.print("Ürün Grubu: ");
        String urunGrubu = scanner.nextLine();

        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();

        System.out.print("Son Kullanma Tarihi (yyyy-MM-dd): ");
        String sonKullanmaTarihiStr = scanner.nextLine();
        LocalDate sonKullanmaTarihi = LocalDate.parse(sonKullanmaTarihiStr);

        System.out.print("Miktar: ");
        int miktar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Birim: ");
        String birim = scanner.nextLine();

        int urunId = generatId();//generatId fonksiyonu çağrılarak bir ürün ID'si oluşturuluyor ve urunId adlı
        // bir tamsayı değişkenine atanıyor.


        //ürün dizesi oluşturuluyor
        String urun = urunId + "-" + urunIsmi + "-" + urunGrubu + "-" + uretici + "-" + miktar + "-" + birim + "-" + sonKullanmaTarihiStr + "-";

        //urunId anahtarı ve urun değeri kullanılarak tumUrunler adlı bir Map (sözlük)
        // nesnesine yeni bir ürün kaydı ekleniyor.
        tumUrunler.put(urunId, urun);

        //urun dizesi listelenenUrunler adlı bir List (liste) nesnesine ekleniyor.
        listelenenUrunler.add(urun);

        System.out.println("Ürün başarıyla girildi.");
    }

    private void stokYonetimi() {
        System.out.println("Stok Kontrolü");

        System.out.println("Stoktaki Ürünler:");
        for (String urun : listelenenUrunler) {
            System.out.println(urun);
        }

        System.out.println("Stok Raporu:");
        System.out.println("Toplam Ürün Sayısı: " + listelenenUrunler.size());

        System.out.println("Stok yönetimi tamamlandı.");
    }
}
