package methodCreationSorular;
import java.util.Scanner;
public class MethodCreationSoru4 {

    // amele köyden ırgat cağıran sehir


    // task // bakiye(baslangıc bakiyesi 1000tl) öğrenme, para yatırma, ve para çekme , çıkış işlemlerinin yapıldığı atm app code cerataedin

    static Scanner sc=new Scanner(System.in);
    static int bakiye=1000;

    public static void main(String[] args) {

        System.out.println("***");
        System.out.println("ATMYE HOŞGELDİNİZ");
        System.out.println("***");
        System.out.println("MÖNÜÜÜÜ: bakiye öğrenmek : 1\nPara yatırma: 2\nPara çekme: 3\nÇıkış: 4\nGiriniz");
        secim();// method call











    }// *** main sonu ***

    public static void secim() {
        System.out.println("agam ne yapacaksan sec");
        int secim=sc.nextInt();
        switch (secim){
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatır();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cıkısYap();
                break;
            default:
                System.out.println("agam daha secim yapamirsen bide para istirsen");
        }


    }




    private static void cıkısYap() {
        System.out.println("agam yine bekleriz çıkış yapıldı");

    }

    private static void paraCek() {
        System.out.println("agam ne kadar cekeceksin");
        int cekilecekMiktar=sc.nextInt();
        if(cekilecekMiktar<=bakiye){
            bakiye-=cekilecekMiktar;
            System.out.println("agam para cebinde");
            System.out.println("agam para hesabında ahanda yeni bakiyen: "+ bakiye);
        }else System.out.println("agam nettin olmayan parayı mı istiyon");
        karar();
    }

    private static void paraYatır() {
        System.out.println("ne kadar yatıracaksın");
        int yatırılacakMiktar= sc.nextInt();
        bakiye+=yatırılacakMiktar;
        System.out.println("agam para hesabında ahanda yeni bakiyen: "+ bakiye);
        karar();
    }

    private static void bakiyeVer() {
        System.out.println("agam bakiye: "+bakiye);
        karar();
    }
    public static void karar(){
        System.out.println("agam isleme \ndevam -> 1\nyeter ->0");
        int karar=sc.nextInt();

        if(karar==1){
            secim();
        }else if (karar==0)cıkısYap();
        else System.out.println("agam adam gibi karar gir");
    }
}
