package soruBankasi;

public class DoWhileSoru9 {

    public static void main(String[] args) {

        String str = "AliCan";
        System.out.println(str.substring(2,5));
    }
}

/*

Dolayısıyla, str.substring(2, 5) ifadesi, "AliCan" String'inin 2. indeksinden (dahil) 5. indeksine (hariç) kadar olan karakterleri alır.

Bu durumda, alt dizi "iCa" olacaktır.

Son olarak, System.out.println() ifadesi kullanılarak alt dizi olan "iCa" ekrana yazdırılır.
 */