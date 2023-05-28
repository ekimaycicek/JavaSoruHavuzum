import java.util.Arrays;

public class ArraysSoru2 {

    public static void main(String[] args) {

        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD yazınız

        int arr[]= {3,5,6,1,9,45,25,4,9,0};


        sırala(arr);


    }

    private static void sırala(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println("arr[i] = " + arr[i]);
        }


    }
    }

