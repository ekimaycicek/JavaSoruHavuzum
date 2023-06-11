package soruBankasi;

import java.util.Scanner;

public class DoWhileSoru10 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String password = "";

     do {
        System.out.println("Passwordunuzu giriniz");
        password = scan.nextLine();

        if(password.equals("AliCan")) {
            System.out.println("Doğru");

        }else {
            System.out.println("Yanlış");

        } }while(!(password.equals("AliCan")));


/*
Scanner sınıfı kullanılarak System.in üzerinden kullanıcıdan veri girişi almak için bir scan nesnesi oluşturulur.

password adında bir boş String değişkeni tanımlanır.

Bir do-while döngüsü oluşturulur. Döngü, kullanıcının doğru şifreyi girene kadar çalışacaktır.

Döngü bloğunda, kullanıcıdan şifreyi girmesi istenir ve girilen şifre password değişkenine atanır (password = scan.nextLine()).

if koşulu kullanılarak girilen şifrenin "AliCan" olup olmadığı kontrol edilir (password.equals("AliCan")).
Eğer girilen şifre "AliCan" ise "Doğru" mesajı ekrana yazdırılır.

else bloğu kullanılarak girilen şifre "AliCan" değilse "Yanlış" mesajı ekrana yazdırılır.

while şartı kullanılarak döngünün devam etmesi veya sona ermesi belirlenir. Şart, girilen şifrenin
"AliCan" olmadığı (!(password.equals("AliCan"))) sürece döngünün devam etmesini sağlar.

Eğer kullanıcı doğru şifreyi girdiyse döngü sona erer ve program tamamlanır.
 */





















        Scanner scan1 = new Scanner(System.in);
        String password1 = "";

        do {
            System.out.println("Passwordunuzu giriniz");
            password1 = scan.nextLine();

            if(!(password1.equals("AliCan"))) {
                System.out.println("Yanlış");
            } }while(!(password1.equals("AliCan")));
        System.out.println("Doğru");



/*
Scanner sınıfı kullanılarak System.in üzerinden kullanıcıdan veri girişi almak için bir scan1 nesnesi oluşturulur.

password1 adında bir boş String değişkeni tanımlanır.

Bir do-while döngüsü oluşturulur. Döngü, kullanıcının doğru şifreyi girene kadar çalışacaktır.

Döngü bloğunda, kullanıcıdan şifreyi girmesi istenir ve girilen şifre password1 değişkenine atanır (password1 = scan1.nextLine()).

if koşulu kullanılarak girilen şifrenin "AliCan" olmadığı kontrol edilir (!(password1.equals("AliCan"))).
 Eğer girilen şifre "AliCan" değilse "Yanlış" mesajı ekrana yazdırılır.

while şartı kullanılarak döngünün devam etmesi veya sona ermesi belirlenir. Şart, girilen şifrenin "AliCan" olmadığı
(!(password1.equals("AliCan"))) sürece döngünün devam etmesini sağlar.

Eğer kullanıcı doğru şifreyi girdiyse döngü sona erer ve "Doğru" mesajı ekrana yazdırılır.

Kod parçası, kullanıcının "AliCan" şifresini doğru bir şekilde girmesi durumunda "Doğru" mesajını ekrana yazdıracak
 ve program tamamlanacaktır. Aksi takdirde, "Yanlış" mesajı ekrana yazdırılıp kullanıcıdan yeni bir şifre girmesi istenecektir.





 */




















        Scanner scan2 = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String password2 = scan.nextLine();
        while(!(password2.equals("AliCan"))) {

            System.out.println("Yanlış");
            System.out.println("Passwordunuzu giriniz");
            password2 = scan.nextLine();
        } System.out.println("Doğru");
    }





    /*

    Scanner sınıfı kullanılarak System.in üzerinden kullanıcıdan veri girişi almak için bir scan2 nesnesi oluşturulur.

System.out.println("Passwordunuzu giriniz"); ifadesi kullanılarak kullanıcıdan şifre girmesi istenir.

Girilen şifre password2 değişkenine atanır (password2 = scan.nextLine();).

Bir while döngüsü oluşturulur. Döngü, girilen şifrenin "AliCan" olmadığı (!(password2.equals("AliCan"))) sürece çalışacaktır.

Döngü bloğunda, "Yanlış" mesajı ekrana yazdırılır.

Yine System.out.println("Passwordunuzu giriniz"); ifadesi kullanılarak kullanıcıdan yeni bir şifre girmesi istenir.

Girilen yeni şifre password2 değişkenine atanır (password2 = scan.nextLine();).

Döngü, girilen şifrenin "AliCan" olup olmadığını kontrol ederek devam eder veya sona erer.

Doğru şifre "AliCan" olarak girildiğinde while döngüsü sona erer ve "Doğru" mesajı ekrana yazdırılır.


     */
}