package stringManipulationSorular;

public class StringManipulationSoru23 {

    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String s="   Java ogrenmek123 Cok guzel@      ";
        System.out.println(s.replaceAll("\\d", "").replace("@", "").replace("C", "c").trim());

    }
}
