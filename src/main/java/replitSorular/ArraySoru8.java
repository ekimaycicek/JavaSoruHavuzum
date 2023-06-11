package replitSorular;

public class ArraySoru8 {

    /*
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]


     */

        public static void main(String[] args) {
            int[] numbers = {1232, 2345, 5467, 678, 3454, 2312, 3451};

            int sayi = ikinciEnBuyukSayiyiBul(numbers);
            System.out.println("2. en büyük sayı: " + sayi);
        }

        public static int ikinciEnBuyukSayiyiBul(int[] numbers) {
            if (numbers.length < 2) {
                throw new IllegalArgumentException("Dizide en az 2 sayı olmalıdır.");
            }

            int enBuyuk = Integer.MIN_VALUE;
            int ikinciEnBuyuk = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > enBuyuk) {
                    ikinciEnBuyuk =enBuyuk;
                    enBuyuk = numbers[i];
                } else if (numbers[i] > ikinciEnBuyuk && numbers[i] < enBuyuk) {
                    ikinciEnBuyuk = numbers[i];
                }
            }

            return ikinciEnBuyuk;
        }
    }


