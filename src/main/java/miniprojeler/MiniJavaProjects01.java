package miniprojeler;
import java.util.Scanner;
public class MiniJavaProjects01 {

    /*

    Proje: Spor Kursu için seçilecek öğrencileri belirleyen
    bir uygulama yazınız.

    kurs gereklilikleri:
        erkekler: boy: 1.60 ve üstü
                  kilo: 70-90 kg
        kadınlar: boy: 1.50 üstü
                  kilo: 50-70 kg

    kullanıcıdan öğrenci sayısı ve her bir öğrenci için
    isim, cinsiyet, kilo ve boy bilgilerini girmesini isteyiniz
     */

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Öğrenci sayısını giriniz: ");
                int ogrenciSayisi = scanner.nextInt();
                scanner.nextLine();

                for (int i = 1; i <= ogrenciSayisi; i++) {
                    System.out.println("Öğrenci " + i + " bilgilerini giriniz:");

                    System.out.print("İsim: ");
                    String isim = scanner.nextLine();


                    System.out.print("Cinsiyet (E/K): ");
                    String cinsiyet = scanner.next();

                    System.out.print("Kilo: ");
                    double kilo = scanner.nextDouble();

                    System.out.print("Boy: ");
                    double boy = scanner.nextDouble();

                    if (cinsiyet.equalsIgnoreCase("E")) {
                        if (boy >= 1.60 && kilo >= 70 && kilo <= 90) {
                            System.out.println(isim + " spor kursuna kabul edildi.");
                        } else {
                            System.out.println(isim + " spor kursuna kabul edilmedi.");
                        }
                    } else if (cinsiyet.equalsIgnoreCase("K")) {
                        if (boy >= 1.50 && kilo >= 50 && kilo <= 70) {
                            System.out.println(isim + " spor kursuna kabul edildi.");
                        } else {
                            System.out.println(isim + " spor kursuna kabul edilmedi.");
                        }
                    } else {
                        System.out.println("Geçersiz ");
                    }

                    System.out.println();
                }
            }
        }



