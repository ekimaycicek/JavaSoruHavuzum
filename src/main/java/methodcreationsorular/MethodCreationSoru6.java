package methodcreationsorular;

public class MethodCreationSoru6 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        int sayı1 = 12, sayı2 = 24, sayı3 = 34;
        sırala(12,24,34);


    }//***

    public static void sırala(int s1 ,int s2, int s3){

        if((s1>s2) && (s1>s3) && (s2>s3)){



        }else if((s2>s1) && (s2>s3) && (s3>s1)){
            System.out.println("s3 en küçük");
        }else if((s3>s1) && (s3>s2) && (s2>s1)){
            System.out.println("s1 en küçük");
        }  else System.out.println("hatalı giris: ");





    }

}
