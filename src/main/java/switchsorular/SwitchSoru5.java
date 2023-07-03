package switchsorular;

import java.util.Scanner;

public class SwitchSoru5 {

    public static void main(String[] args) {


        //gunleri gösterebilen bir program yazın
        //    gun Pazartesi veya Sali ise:
        //    Java dersi gunleri
        //
        //    gun Persembe veya Cuma ise:
        //    Selenyum dersi gunleri
        //
        //    gun carsamba veya cumartesi ise:
        //    SQL dersi gunleri
        //
        //    aksi halde: izin gunu
        //    (if deyimini KULLANMAYIN)



        Scanner input = new Scanner(System.in);
        System.out.println("gün giriniz");
            String day= input.nextLine();
            switch (day) {

                case "pazartesi":
                case "sali":
                    System.out.println("java class");
                    break;

                case "persembe":
                case "cuma":
                    System.out.println("selelnyum class");
                    break;
                case "cumartesi":
                case"pazar":
                    System.out.println("sql class");
                    break;
                default:
                    System.out.println("off day");

            }


        }
    }

