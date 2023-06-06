import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bb {

    public static void main(String[] args) {
        int isMiktari = 50;
        int minTonaj = 30;
        int maxTonaj = 35;

        List<Integer> tonajListe = generateRandomTonajListe(isMiktari, minTonaj, maxTonaj);

        int toplamTonaj = 0;
        for (int i = 0; i < tonajListe.size(); i++) {
            int tonaj = tonajListe.get(i);
            int aracNumarasi = i + 1;
            System.out.println("Araç " + aracNumarasi + "- Tonajı: " + tonaj + " Ton");
            toplamTonaj += tonaj;
        }

        System.out.println("Toplam İş Tonajı: " + toplamTonaj + " Ton");
    }

    public static List<Integer> generateRandomTonajListe(int isMiktari, int minTonaj, int maxTonaj) {
        List<Integer> tonajListe = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < isMiktari; i++) {
            int tonaj = random.nextInt(maxTonaj - minTonaj + 1) + minTonaj;
            tonajListe.add(tonaj);
        }

        return tonajListe;
    }

}
