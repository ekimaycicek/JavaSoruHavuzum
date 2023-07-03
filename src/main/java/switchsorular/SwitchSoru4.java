package switchsorular;

import java.util.Scanner;

public class SwitchSoru4 {

    //girilen ay hangi mevsimde oldugunu print eden kodu yaziniz


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("ay giriniz: ");
        int ay= sc.nextInt();

        switch (ay){

            case 12:
            case 1:
            case 2:
                System.out.println("mevsim kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("mevsim ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("mevsim yaz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("mevsim sonbahar");
                break;

            default:
                System.out.println("yanlış giriş");



        }}}