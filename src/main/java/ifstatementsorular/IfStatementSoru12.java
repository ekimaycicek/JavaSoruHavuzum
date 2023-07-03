package ifstatementsorular;

import java.util.Scanner;

public class IfStatementSoru12 {

    /*
   not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz


    */

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("not giriniz: ");

        int not=sc.nextInt();


        if(not>=0 && not<=59){

            System.out.println("f");


        }else if (not>=60 && not<=69){

            System.out.println("d");


        }else if(not>=70 && not<=79){
            System.out.println("c");

        }else if(not>=80  && not<=89){
            System.out.println("b");

        }else if(not>=90 && not<=100){
            System.out.println("a");

        }else System.out.println("hatalı girdin gardaaaaş");


    }  }




