import java.util.Arrays;

public class a8 {

    public static void main(String[] args) {

        String[] oturumPlan = new String[10];
        System.out.println(Arrays.toString(oturumPlan));

        String aa = "Rezerve Değil Agam";

        Arrays.fill(oturumPlan, aa);
        System.out.println(Arrays.toString(oturumPlan));
    }
}
