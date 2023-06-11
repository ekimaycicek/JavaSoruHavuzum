package replitSorular;

public class ForLoopSoru3 {

    /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
     */

        public static void main(String[] args) {

            String str = "Javaisalsoeasy";
            String tekrarlananKarakter = tekrarlananKarakteriBul(str);
            System.out.println("Tekrar eden karakterler: " + tekrarlananKarakter);
        }

        public static String tekrarlananKarakteriBul(String str) {
            String tekrarlananKarakter = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == ch && tekrarlananKarakter.indexOf(ch) == -1) {
                        tekrarlananKarakter += ch;
                        break;
                    }
                }
            }

            return tekrarlananKarakter;
        }
    }


