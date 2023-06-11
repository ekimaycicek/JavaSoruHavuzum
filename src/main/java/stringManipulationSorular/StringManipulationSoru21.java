package stringManipulationSorular;

import java.util.Scanner;

public class StringManipulationSoru21 {

    public static void main(String[] args) {

          /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner sc=new Scanner(System.in);
        System.out.println("name1 giriniz: ");
        String name1= sc.nextLine();
        System.out.println("name2 giriniz: ");
        String name2=sc.nextLine();

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)) );

        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

    }
}
