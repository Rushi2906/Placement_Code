public class DP_12_5_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selection(arr);
    }

    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
             
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
