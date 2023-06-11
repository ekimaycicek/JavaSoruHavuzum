package sarkiSorusu;

import java.util.Arrays;

public class SarkiSorusu {

    public static void main(String[] args) {

/* binary kullanmadan:
    String[] favoriSarkilar = {"Yolcu", "Perişan Hallerim", "Kesik Çayır", "Bir Ayrılık  Bir Yoksulluk", "Yalan Dünya"};

    String aradigimizSarki = "Perişan Hallerim";

    boolean favoriMi = false;

    for (String sarki : favoriSarkilar) {
        if (sarki.equals(aradigimizSarki)) {
            favoriMi = true;
            break;
        }
    }

    if (favoriMi) {
        System.out.println(aradigimizSarki + " favori şarkılardan biri işte budur agam.");
    } else {
        System.out.println(aradigimizSarki + " favori şarkılar arasında bu bulunmuyor agam.");
    }
    }

*/



    String[] AgaminfavoriSarkilari = {"Yolcu", "Perişan Hallerim", "Kesik Çayır", "Bir Ayrılık  Bir Yoksulluk", "Yalan Dünya"};
    Arrays.sort(AgaminfavoriSarkilari);

            String arananSarki = "Perişan Hallerim";

            int indeks = Arrays.binarySearch(AgaminfavoriSarkilari, arananSarki);

            if (indeks >= 0) {
            System.out.println(arananSarki + " favori şarkılardan biri işte budur agam.");
            } else {
            System.out.println(arananSarki + " favori şarkılar arasında bu bulunmuyor agam.");
            }

            }}



