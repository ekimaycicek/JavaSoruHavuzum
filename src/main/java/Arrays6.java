public class Arrays6 {
    public static void main(String[] args) {

        /*
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[]= {1,2,3,4,5,6,7};
        int toplam=0;



        for (int i = 0; i <input.length ; i++) {

            toplam+=input[i];
        }
        double ort=toplam/input.length;
        System.out.println("ort = " + ort);

        System.out.println("ort dan büyük elemanlar");


        for (int i = 0; i < input.length; i++) {

            if (input[i] > ort) {

                System.out.println("i = " + i);
            }

        }
    }
}
