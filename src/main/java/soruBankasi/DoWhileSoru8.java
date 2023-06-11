package soruBankasi;

public class DoWhileSoru8 {

    public static void main(String[] args) {


        int num=0;
        do {
            if(num%2==0){
                System.out.print(num + " ");
            }
            num++;

        }while(num<8);

    }
}

/*

Döngü bloğunda, öncelikle num'un 2'ye tam bölünüp bölünmediği kontrol edilir (num % 2 == 0).
Eğer num 2'ye tam bölünüyorsa (yani çift sayı ise), System.out.print(num + " "); ifadesi kullanılarak num değeri ekrana yazdırılır.

Daha sonra num değişkeni 1 artırılır (num++). Bu işlem, döngünün her bir işleminde gerçekleşir.

Döngünün şartı num'un 8'den küçük olmasıdır (num < 8). Başlangıçta num değeri 0 olduğu için bu şart başlangıçta doğrudur.

Bu kod parçası, sadece çift sayıları ekrana yazdırmak için bir koşul kontrolü eklemiştir. num'un 2'ye tam bölünmesi
durumunda sadece çift sayılar ekrana yazdırılır. Tek sayılar ise atlanır.

Sonuç olarak, döngü bloğu sürekli çalışacak, num değeri her seferinde 1 artacak ve num'un çift sayı olduğu
 durumlarda sadece çift sayılar ekrana yazdırılacaktır. Döngü, num değeri 8 olduğunda duracak,
 çünkü o noktada num < 8 koşulu sağlanmayacaktır.


 */