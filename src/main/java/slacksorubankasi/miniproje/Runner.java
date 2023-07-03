package slacksorubankasi.miniproje;

public class Runner {

    public static void main(String[] args) {

        Arac arac1=new Arac("volvo xc60","gri",-200,2012);
        Arac arac2=new Arac("ford focus","lacivert",2000,-2015);
        Arac arac3=new Arac();

        arac3.setModel("connect");
        arac3.setMotor(1800);
        arac3.setYıl(2008);
        arac3.setRenk("karamel");


        System.out.println("arac1 = " + arac1);
        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);



    }
}
