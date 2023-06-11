package slackSoruBankasi;

import java.util.ArrayList;
public class ArraySoru {



        public static void main(String[] args) {

            ArrayList<ArrayList<String>> List = new ArrayList<>();

            ArrayList<String> calisan = new ArrayList<>();
            calisan.add("Ekim");
            calisan.add("Sümeyye");
            calisan.add("Büşra");

            ArrayList<String> isveren = new ArrayList<>();
            isveren.add("SüleymanHoca :D");
            isveren.add("Jeff Bezos");
            isveren.add("isveren trendyol");

            ArrayList<String> sirket = new ArrayList<>();
            sirket.add("techPro");
            sirket.add("amazon");
            sirket.add("trendyol");


            List.add(calisan);
            List.add(isveren);
            List.add(sirket);

            ArrayList<String> calisanList = List.get(0);
            ArrayList<String> isverenList = List.get(1);
            ArrayList<String> sirketList = List.get(2);

            System.out.println("Çalışanlar: " + calisan);
            System.out.println("İşverenler: " + isveren);
            System.out.println("Şirketler: " + sirket);
        }
    }

