package String;

public class Replace_ReplaceAll {

    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */


        String str="javacanlara selam java ile bolcana offer";
        System.out.println(str.replace('a', '@'));

        System.out.println(str.replace("java", "kan"));

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        System.out.println(str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler


        String str1="    javacanlara selam olsun :)java ile bolcana 123455544 offer ***  ";

        System.out.println(str1.replaceAll("\\s", "+"));//++++javacanlara+selam+olsun+:)java+ile+bolcana+123455544+offer+***++
        System.out.println(str1.replaceAll("\\d", "+"));// javacanlara selam olsun :)java ile bolcana +++++++++ offer ***
        System.out.println(str1.replaceAll("\\w", "+"));//+++++++++++ +++++ +++++ :)++++ +++ +++++++ +++++++++ +++++ ***
        System.out.println(str1.replaceAll("\\W", "+"));//++++javacanlara+selam+olsun+++java+ile+bolcana+123455544+offer++++++
        System.out.println(str1.replaceAll("\\D", "+"));//+++++++++++++++++++++++++++++++++++++++++++++++123455544++++++++++++
        System.out.println(str1.replaceAll("\\S", "+"));//+++++++++++ +++++ +++++ ++++++ +++ +++++++ +++++++++ +++++ +++


        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234




        String isim="ekim";
        String soyisim="aycicek";
        String kartno="1223456456215622";

        System.out.println(isim.charAt(0) + isim.substring(1).replaceAll("\\w","*"));
        System.out.println(soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w","*"));



        String yeniKartNo = "**** **** **** ****" + kartno.substring(12);

        System.out.println(yeniKartNo);


    }
}
