package soruBankasi;

public class DoWhileSoru6 {


    public static void main(String[] args) {

        int num = 2; do {

            System.out.print(num + " ");

            num++;

        }while(num>2);
    }
}

/*

Bu kod parçası bir do-while döngüsü kullanarak num değişkenini başlangıçta 2 olarak atayarak, sonsuz bir döngü oluşturur.

Döngü bloğunda, num değeri ekrana yazdırılır ve ardından num değişkeni 1 artırılır. Bu işlem döngünün her işlemde gerçekleşir.

Döngünün şartı ise num'un 2'den büyük olmasıdır (num > 2). Ancak, başlangıçta num'un değeri zaten 2 olduğu için
şart her zaman doğru olacaktır.

Sonuç olarak, döngü bloğu sürekli çalışacak, num değeri her seferinde bir artacak ve num değeri her
 işlemde ekrana yazdırılacaktır. Ancak, döngünün koşulu sürekli doğru olduğu için döngü asla sona ermeyecektir ve sonsuz bir döngü oluşacaktır.
 */