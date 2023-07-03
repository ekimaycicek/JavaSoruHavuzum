package depoprojesi4;
import java.time.LocalDate;
import java.util.*;



public class Depo1 {


    private Map<Integer, String> tumUrunler;
    private List<String> listelenenUrunler;
    private static List<String> ureticiler;
    private List<String> raflar;

    static Scanner scanner = new Scanner(System.in);

    public Depo1() {


        listelenenUrunler = new ArrayList<>();
        tumUrunler = new HashMap<>();
        ureticiler = new ArrayList<>();
        raflar = new ArrayList<>();

        giris();


    }

    private void giris() {

        while (true) {
            System.out.println(" * * Yakamoz Sarkuteri Urun Yonetim Sistemine * * \n"
                    + "\t\t* HOSGELDINIZ \t\t\n"
                    + "\t\t LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN \t\t*\n");
            System.out.println("\t1- Urun Girisi\n"
                    + "\t2- Urun Listesi\n"
                    + "\t3- Raf Kontrolu\n"
                    + "\t4- Urunu Rafa Koy\n"
                    + "\t5- Stok Kontrol\n"
                    + "\t6- Urun Cikisi\n"
                    + "\t7- CIKIS");


            String secimStr = scanner.nextLine();

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
                    System.out.println("sistemden çıkış yapılıyor");
                    return;

                default:
                    System.out.println("hatalı bir tuşlama yaptınız");
                    break;
            }

        }
    }


        private void tumUrunler() {
            System.out.println(tumUrunler);
        }


        private void rafKontrolu() {
            System.out.println("Raf Kontrolü: ");
            System.out.println("Raf Durum Raporu: ");

            for (String raf : raflar){
                System.out.println(raf);
            }

        }

        private int urunIdCounter=1000;
        private int generatId() {
            int urunId = urunIdCounter;
            urunIdCounter += 10;
            return urunIdCounter;
        }

        private void urunCikisi() {
        }

        private void urunuRafaKoy(){

            System.out.println("Ürünü Rafa Yerlestirme: ");

            System.out.println("Urun ID'sini girin: ");
            int urunId = scanner.nextInt();
            scanner.nextLine();

            if (tumUrunler.containsKey(urunId)){
                String urun = tumUrunler.get(urunId);

                System.out.println("Raf numarası girin: ");
                String raf = scanner.nextLine();

                tumUrunler.put(urunId, urun.replaceFirst("-\\d+-" , "-" + raf + "-"));
                System.out.println("ürün " + raf + " rafına yerleştirildi ");

            }else {
                System.out.println("Girilen ID'ye sahip değer bulunamadı");
            }













        }

        private void urunGirisi() {
            System.out.println("Sistemde kayitli tum urunler.");
           tumUrunler();

            System.out.println("Ürün Girişi ");

            System.out.println("Ürün Adı: ");
            String urunIsmi =scanner.nextLine();

            System.out.println("Ürün Grubu: ");
            String urunGrubu =scanner.nextLine();

            System.out.println("Üretici: ");
            String uretici =scanner.nextLine();

            System.out.println("Son Kullanma Tarihini yıl-gün-ay şeklinde giriniz: ");
            String sonKullanmaTarihi1 =scanner.nextLine();
            LocalDate sonKullanmaTarihi = LocalDate.parse(sonKullanmaTarihi1);

            System.out.println("Miktar Giriniz: ");
            double miktar = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Birim Giriniz: ");
            String birim =scanner.next();

            int urunId = generatId();

            String urun =urunIsmi + " - " + urunGrubu + " - " + uretici + " - " + miktar + " - " + birim + " - " + sonKullanmaTarihi1;


            tumUrunler.put(urunId, urun);
            listelenenUrunler.add(urun);

            System.out.println("Ürün Başarıyla Girildi ");




        }

        private void stokYonetimi() {
        }


    }


