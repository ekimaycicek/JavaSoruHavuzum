package depoprojesi2;
import depoprojesi.Urun;

import java.util.*;
public class Depo {

        private Map<Integer, Urun> urunler;
        private List<String> urunListesi;
        private Scanner input;

        public Depo() {
            urunler = new HashMap<>();
            urunListesi = new ArrayList<>();
            input = new Scanner(System.in);


        }

        public void urunTanimlama() {
            System.out.println("Urun ismini girin: ");
            String urunIsmi = input.nextLine();

            //.....
        }

        public void urunListele() {
            System.out.println("id\tismi\t\turetici\t\tmiktari\t\tbirimi\t\traf");
            System.out.println("--------------------------------------------------------------");
            //.....
        }



    public void urunGirisi() {
        System.out.println("Mevcut ürünler:");
        urunListele();

       //....
    }



       public void urunuRafaKoy() {
           System.out.println("Raf numarası girin: ");
           String raf = input.nextLine();

           //....
       }


    public void urunCikisi() {
            System.out.println("Urun id'sini girin: ");
            int urunId = Integer.parseInt(input.nextLine());

         //....
        }


            public int urunIdCounter = 1000;

            private int generateUrunId() {
                return urunIdCounter++;
            }

        public void giris() {
            boolean devam = true;
            while (devam) {
                System.out.println("1- Urun tanimlama");
                //....

                //switch (secim) {
                    //case 1:



                //.....

            }
        }


    }


