public class LoopTekrar {

    public static void main(String[] args) {


         /*
        loop-> döngü tekrarlanan aksiyonlar icin kullanılan code bloklarıdır
         */

        // task -- iki basamaklı tek sayıları yan yan print eden kodu yazınız

        for (int i = 11; i < 100; i += 2) {
            if (i % 2 == 1) {
                System.out.print(i + " ");

            }


        }
        for (int i = 0; i >10 ; i++) {//sartı sağlamayan false olan for body run olmaz kod kırılır sıradaki satırdan devam eder
            System.out.println("saelam java");

        }

        System.out.println("agam bu metni okuduysan kod çalışmadı");

        for (int i = 0; i >=0 ; i++) {// bu for cuğarayı cüpiterden yakana kadar calışır durdurana ask olsun
            System.out.println(i);

        }
    }
}
