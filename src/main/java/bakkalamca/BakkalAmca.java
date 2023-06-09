package bakkalamca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BakkalAmca {



    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String>gunler=new ArrayList<>(Arrays.asList("pazartesi","salı","carsamba","persembe","cuma","cumartesi","pazar"));
    static ArrayList<Double> gunlukKazanclar=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static double haftaCirosu=0;
    public static void main(String[] args) {
        int gun=0;
        while (gun<7){
            System.out.println("agam hele "+ gunler.get(gun) + " gunun hasılatını gir: ");

            double gunKazancı=sc.nextDouble();

            gunlukKazanclar.add(gunKazancı);

            haftaCirosu+= gunKazancı;

            gun++;

        }
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
        getOrtalamaKazanc();
        System.out.println("haftanın cirosu :" + haftaCirosu);
        System.out.println("haftanın ortalaması : " + getOrtalamaKazanc());
        System.out.println("ortalam ustu kazanc olan günler : "+getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalam altı kazanc olan günler : "+getOrtalamaninAltindaKazancGünleri());
    }//methon sonu

    private static String getOrtalamaninAltindaKazancGünleri() {//6. adim
        String ortalamaAltıGun = "";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {// gunluk hasilat döngüsü
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) { //gunluk hasilat haftanin ortalamasi ile kontrol
                ortalamaAltıGun += gunler.get(i);//ortlamanin altindaki hasilat olan gun ortalama alti gune eklendi
            }
        }

        return ortalamaAltıGun;


    }

    private static String getOrtalamaninUstundeKazancGünleri() {//5. adim
        String ortalaUstuGun = "";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {// gunluk hasilat döngüsü
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) { //gunluk hasilat haftanin ortalamasi ile kontrol
                ortalaUstuGun += gunler.get(i);//ortalamanin ustunde hasilat olan gun ortalama ustu gune eklendi
            }
        }

        return ortalaUstuGun;
    }

    private static double getOrtalamaKazanc() {//4. adim

        double ortalama = haftaCirosu / 7;

        return ortalama;

    }
    }
