package kahvemakinesi;

import java.util.Scanner;

public class method {
    /*
    1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın.
         String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod
        calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
        --(Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller:
         Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
        Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
  (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...
                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
        (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın.
        ("Kahveniz" + boyut + "hazırlanıyor.)
                    //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
         orta boy için de String boyut ' u kullanın.)

     */

    String hangiKahve;
    String sut;
    String seker;
    String boyut;

    Scanner input = new Scanner(System.in);

    public void hangiKahveSec() {
        System.out.println("hangi kahveyi istersiniz");
        System.out.println("Türk Kahvesi ,Filtre Kahve,Expresso");
        hangiKahve = input.nextLine().toLowerCase();


        switch (hangiKahve){
            case "türk kahvesi":
                System.out.println("Türk kahvesi hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            case "filtre kahve":
                System.out.println("filtre kahve hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            case "expresso":
                System.out.println("expresso hazırlanıyor");
                sutSec();
                sekerSec();
                boyutSec();
                sonuc();
                break;
            default:
                System.out.println("lütfen bir seçim yapınız");
        }
    }

    public void sutSec(){


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        sut=input.next().toLowerCase();
        switch (sut){
            case "evet":
                System.out.println("Kahvenize süt ekleniyor" );
                break;
            case "hayır":
                System.out.println("Kahvenize süt eklenmiyor" );
        }
    }
    public void sekerSec(){
        System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        seker=input.next().toLowerCase();
        if (seker.equals("evet")){
            System.out.println("Kahvenize şeker ekleniyor.");
        }
        if (seker.equals("hayır")) {
            System.out.println("Kahvenize şeker eklenmiyor.");
        }
    }

    public void boyutSec(){
        System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.");
        boyut=input.next().toLowerCase();

        if (boyut.equalsIgnoreCase("büyük ")){
            System.out.println("Kahveniz "+   boyut  + " hazırlanıyor.");
        }else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahveniz  "+  boyut  +" hazırlanıyor.");
        }else if (boyut.equalsIgnoreCase("küçük boy")) {
            System.out.println("Kahveniz   " +  boyut  +"  hazırlanıyor.");
        }

    }
    public void sonuc(){

        System.out.println("Kahveniz " + boyut +" "  + "boy " +   hangiKahve + " şeklinde hazırlandı.Afiyet Olsun..." ) ;

    }

}




