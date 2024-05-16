public class DP_14_5_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {3,6,5,3,7};
        bubble(arr);
    }

    // Time Complexity
    // Best Case : O(n) - If array is sorted
    // Worst Case : O(n^2)

    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
