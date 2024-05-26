public class DP_25_5_2_Array_Median {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        double ans = median(arr1, arr2);
        System.out.println(ans);
    }

    public static double median(int[] arr1, int[] arr2){
        
        double sum = 0;

        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }

        double ans = sum/(arr1.length+arr2.length);
        return ans;
    }
}
