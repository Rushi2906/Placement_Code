/**
 * DP_13_5_Reverse_Array
 */
public class DP_13_5_Reverse_Array {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}