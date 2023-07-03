package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru11 {


      /*
        Print "Lutfen is unvaninizi girin
        isUnvani isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru isUnvani yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger isUnvani  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Lutfen is ünvanınızı giriniz: ");

        String isUnvani=sc.nextLine().toLowerCase();

        if(isUnvani.equals("qa")){

            System.out.println("Quality Analyst");


        }else if (isUnvani.equals("dev")){

            System.out.println("developer");
        }

        else if (isUnvani.equals("ba")){
            System.out.println("business analyst");
        }
        else if(isUnvani.equals("pm")){
            System.out.println("project manager");


        }else System.out.println("hatalı giriş");

    }

}


