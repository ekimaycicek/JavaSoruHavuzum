import java.util.TreeMap;

public class HomeWork {

    public static void main(String[] args) {


        String s = "Hello Henry!"; // Bu method ile kullanilacak harfler soruldugundan bir String olusturacagiz.
        System.out.println(getTheNumOfOccurrenceOfLetters(s));

        //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    }//main

    public static TreeMap<String, Integer> getTheNumOfOccurrenceOfLetters(String s) {// Soruya bakildiginda map
        // kullanilacagi anlasiliyor. Main method disinda method olusturacagiz. HashMap olarak olusturdugumuz
        // methodu static yapiyoruz. Boylece main methodu kullanabilecegiz.

        //String'deki harf disi character'leri sil
        s = s.replaceAll("[^A-Za-z]", "");
        //Biz harflere bakacagimizdan doları harfler disindaki
        // karakterleri replaceAll methodu ile silecegiz.
        //  Eger harf degil her karakterin kac kez kullanildigi denseydi bu silme islemini yapmazdik.

        //Gorunum sayilarini depolamak icin Map olustur.
        TreeMap<String, Integer> numOfOccurrence = new TreeMap<>();//alfabetik sıra ile versin diye tree map kullandık

        //Harfleri al
        String letters[] = s.split("");// Harfleri almaliyiz. Bunun icin split methodu kullaniriz.
        // s isimli Stringimiz ile split methodunu kullaniriz split icine hiclik saydigimiz "", koyduk.
        // Boylece tek tek her harfi alabiliriz.Aldigimiz harfleri yine bir String array'e koyduk ve ona
        // letters dedik. Split methodu arraylerde kullanilir.

        for (String w : letters) {//Loop olusturmamiz gerekir. For each loop icinde harfleri barindiran letters'i
            // w olan String'e atadik.


                    Integer numOfOcc = numOfOccurrence.get(w);// get methodunu Map ismi ile kullanabildik ve w;yi aldik,
            // bir Integer variable'ina assign ettik. Bu yolla harfin kac kez gorundugunu bulacagiz.


            if (numOfOcc == null) {// Bir if statement ile map kendisine w'yu assign ettigimiz Integer variable'in
                // null'a esit olup olmadigini bulmaya calistik.
                numOfOccurrence.put(w, 1);//Null ise o eleman yok demektir ve olmayan
                // eleman yerine 1 degerini verdik
                // Put methodu bize o elemani al, yerine su degeri ver dedigimizde onu yapar.
                // Ornek w'yi al, yerine bir yerlestir.

            } else {// bize o elemani al, yerine su degeri ver dedigimizde onu yapar. Ornek w'yi al, yerine bir yerlestir.
               // Daha sonra loop ile diger elemana bakacagiz. O eleman varsa ilk if statementa artik calismaz,
                // else bolumune gecilir ve buna gore deger artisi yapilir.
                numOfOccurrence.replace(w, numOfOcc + 1);//Var olan bir eleman ise w icinde buldugumuz o elemana arti
                // bir deger verdik. O eleman once bir iken bu defa iki olur, sonraki dongulerde
                // yine varsa iki olan elaman artik 3 olacak.
            }
        }

        return numOfOccurrence;
    }



}
