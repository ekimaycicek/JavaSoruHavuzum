public class a5 {
    public static void main(String[] args) {


        int[] arr = {84, 91, 76, 85, 98};
        int tplm = 0;

        for (int w : arr){
            tplm += w;
        }

        double ortalama = (double) tplm/arr.length;
        System.out.println(ortalama);

    }

}
