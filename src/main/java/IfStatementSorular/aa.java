package ifstatementsorular;

import java.util.Scanner;

public class aa {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Lütfen cinsiyetinizi giriniz");
            String cinsiyet = scan.nextLine().toLowerCase();

            System.out.println("Lütfen yaşınızı giriniz");
            int yas = Math.abs(scan.nextInt());

            if (cinsiyet.equalsIgnoreCase("kadın")) {
                if (yas > 60) {
                    System.out.println("Lütfen prim gününüzü giriniz");
                    int primgunu = scan.nextInt();
                    if (primgunu > 6000) {
                        System.out.println("EYT'ye takılmadın, oylar AKP'ye!");
                    } else {
                        System.out.println("Eşek gibi çalışmaya devam, ekonomi çok iyi!");
                    }
                } else {
                    System.out.println("Emekli olma şartlarını sağlamıyorsunuz.");
                }
            } else if (cinsiyet.equalsIgnoreCase("erkek")) {
                if (yas > 65) {
                    System.out.println("Lütfen prim gününüzü giriniz");
                    int primgunuerkek = scan.nextInt();
                    if (primgunuerkek > 7000) {
                        System.out.println("EYT'ye takılmadın, oylar AKP'ye!");
                    } else {
                        System.out.println("Eşek gibi çalışmaya devam, ekonomi çok iyi!");
                    }
                } else {
                    System.out.println("Emekli olma şartlarını sağlamıyorsunuz.");
                }
            } else {
                System.out.println("Geçersiz cinsiyet girişi.");
            }
        }
    }

