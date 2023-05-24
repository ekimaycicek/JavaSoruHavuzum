package String;

public class Concanations {

    public static void main(String[] args) {
        /*
        concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
        java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */


        String name= "Nur";
        String meslek="qa tester";

        System.out.println(name.concat(meslek));//Nurqa tester
        // trick-- string methodları variable da gecici değisiklik yapar ama değişken atama yapılırsa kalıcı değişir
        name=meslek.concat(name);
        System.out.println("name = " + name);

        System.out.println(name.concat(true + ":)"));

        // trick-- concat methodu parametre olarak string type harici tüm dataları stringe çevirip concat eder



    }
}
