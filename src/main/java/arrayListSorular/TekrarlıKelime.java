package arrayListSorular;

import java.util.*;

public class TekrarlıKelime {

    public static void main(String[] args) {
        List<String> kelimeListesi = Arrays.asList("merhaba", "dünya", "java", "java", "dünya", "merhaba");
        Map<String, Integer> kelimeFrekanslari = new HashMap<>();

        for (String kelime : kelimeListesi) {
            if (kelimeFrekanslari.containsKey(kelime)) {
                int frekans = kelimeFrekanslari.get(kelime);
                kelimeFrekanslari.put(kelime, frekans + 1);
            } else {
                kelimeFrekanslari.put(kelime, 1);
            }
        }

        int enYuksekFrekans = 0;
        for (int frekans : kelimeFrekanslari.values()) {
            if (frekans > enYuksekFrekans) {
                enYuksekFrekans = frekans;
            }
        }

        List<String> enSikTekrarEdenKelimeler = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : kelimeFrekanslari.entrySet()) {
            if (entry.getValue() == enYuksekFrekans) {
                enSikTekrarEdenKelimeler.add(entry.getKey());
            }
        }

        System.out.println("En sık tekrar eden kelime(ler):");
        for (String kelime : enSikTekrarEdenKelimeler) {
            System.out.println(kelime);
        }
    }
}
