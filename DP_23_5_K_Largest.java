import java.util.Arrays;

public class DP_23_5_K_Largest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        kLargest(arr,k);
    }

    public static void kLargest(int[] arr, int k){
        Arrays.sort(arr);

        if(k>arr.length){
            System.out.println("K is greater than the length");
        }

        for(int i=arr.length-1;i>=0;i--){
            if(k==1){
                System.out.println(arr[i]);
            }
            k--;
        }
    }
}
