public class LoopSoru10 {

    public static void main(String[] args) {

        //        1
        //        2 6
       //        3 7 10
       //        4 8 11 13
       //        5 9 12 14 15

        int i, j, k, m;
        for (i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            m = 4;
            k = i + m;
            for (j = 1; j < i; j++) {
                System.out.print(k + " ");
                m--;
                k = k + m;
            }
            System.out.println();


        }
    }


}
