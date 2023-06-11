package soruBankasi;

public class DoWhileSoru7 {

    public static void main(String[] args) {

        int num=0;
        do {
            System.out.print(num + " ");
            num+=2;
        }while(num<8);

    }
}

/*
Bu kod num değişkenini başlangıçta 0 olarak atayarak bir do-while döngüsü oluşturur.

Döngü bloğunda, num değeri ekrana yazdırılır ve ardından num değişkenine 2 eklenir (num += 2).
 Bu işlem döngünün her bir işleminde gerçekleşecek.

Döngünün şartı ise num'un 8'den küçük olmasıdır (num < 8). Başlangıçta num değeri 0 olduğu için de bu şart başlangıçta doğrudur.

Döngü bloğu içinde num değeri ekrana yazdırıldıktan sonra, num değişkenine 2 eklenir ve döngü tekrar başa döner.
 Bu işlem, num'un 8'den küçük olduğu sürece devam edecek.

Sonuç olarak, döngü bloğu sürekli çalışacak, num değeri her seferinde 2 artacak ve num değeri her
 işlemde ekrana yazdırılacak. Döngü, num değeri 8 olduğunda duracak, çünkü o noktada num < 8 koşulu sağlanmayacaktır.
 */