public class DP_15_5_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {1,6,3,8,5};
        insertion(arr);
    }

    // Time Complexity
    // Best Case : O(n) - If array is sorted
    // Worst Case : O(n^2)

    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
