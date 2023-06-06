import java.util.Arrays;

public class a4 {

    public static void main(String[] args) {

        int[] sayi = {1, 2, -3, 4, -5, -6};

        for (int i = 0; i < sayi.length; i++) {
            sayi[i]*=-1;
        }

        System.out.println(Arrays.toString(sayi));

    }
}
