import java.util.Scanner;

public class SwitchAtmProjesi {

    public static void main(String[] args) {

        // bakiye(baslangıc bakiyesi 1000tl) öğrenme, para yatırma, ve para çekme , çıkış işlemlerinin
        // yapıldığı atm app code cerataedin




        Scanner sc=new Scanner(System.in);
        System.out.println("***");
        System.out.println("ATMYE HOŞGELDİNİZ");
        System.out.println("bakiye öğrenmek : 1\nPara yatırma: 2\nPara çekme: 3\nÇıkış: 4\nGiriniz");
        int seçim=sc.nextInt();
        int bakiye=1000;
        switch (seçim) {
            case 1:
                System.out.println("agam bakiye: " + bakiye);
                break;
            case 2:
                System.out.println("ne kadar yatıracaksın");
                int yatıralanmiktar = sc.nextInt();
                bakiye += yatıralanmiktar;
                System.out.println("güncel bakiye :" + bakiye);
                break;
            case 3:
                System.out.println("ne kadar çekeceksin");
                int çekilentutar = sc.nextInt();
                if (çekilentutar > bakiye) {
                    System.out.println("hesapta para yok");
                    System.out.println("ahanda bakiye");
                } else
                    bakiye -= çekilentutar;
                System.out.println("güncel bakiye :" + bakiye);
                break;
            case 4:
                System.out.println("çıkış yapıldı");
                break;
            default:
                System.out.println("hatalı giriş");
        }










    }
}
