public class DP_26_5_Array_New_Length {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int target = 2;
        int length = newLength(arr,target);
        System.out.println(length);
    }

    public static int newLength(int[] arr,int target){
        int newLength = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                newLength--;
            }
        }
        return newLength;
    }
}
