package calmaListesi;

import java.util.ArrayList;
import java.util.Scanner;

public class MuzikCalmaListesi {

    public static void main(String[] args) {

        /*
        Bir müzik çalma listesi geliştiriyoruz ve kullanıcıların favori
         şarkılarını ekleyebilmeleri için bir mekanizma oluşturmanız gerekiyor.
         Ayrıca, kullanıcıların şarkıları silebilmeleri ve çalma listesini görebilmeleri için bir
         arabirim sağlamanız gerekiyor.
         */


                ArrayList<String> calmaListesi = new ArrayList<>();
                Scanner input = new Scanner(System.in);

                while (true) {
                    System.out.println("1. Şarkı ekle");
                    System.out.println("2. Şarkı sil");
                    System.out.println("3. Çalma listesini göster");
                    System.out.println("4. Çıkış");
                    System.out.print("Seçiminizi yapın: ");
                    int secim = input.nextInt();
                    input.nextLine(); // Boş satırı oku

                    if (secim == 1) {
                        System.out.print("Eklemek istediğiniz şarkıyı girin: ");
                        String sarki = input.nextLine();
                        calmaListesi.add(sarki);
                        System.out.println("Şarkı başarıyla eklendi.");
                    } else if (secim == 2) {
                        System.out.print("Silmek istediğiniz şarkının adını girin: ");
                        String silinecekSarki = input.nextLine();
                        if (calmaListesi.contains(silinecekSarki)) {
                            calmaListesi.remove(silinecekSarki);
                            System.out.println("Şarkı başarıyla silindi.");
                        } else {
                            System.out.println("Belirtilen şarkı çalma listesinde bulunamadı.");
                        }
                    } else if (secim == 3) {
                        System.out.println("Çalma Listesi:");
                        if (calmaListesi.isEmpty()) {
                            System.out.println("Çalma listesi boş.");
                        } else {
                            for (String sarki : calmaListesi) {
                                System.out.println(sarki);
                            }
                        }
                    } else if (secim == 4) {
                        System.out.println("Programdan çıkılıyor...");
                        break;
                    } else {
                        System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                    }

                    System.out.println();
                }

                input.close();
            }
        }

