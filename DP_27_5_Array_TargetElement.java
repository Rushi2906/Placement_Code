public class DP_27_5_Array_TargetElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        int ans = arrayTarget(arr,target);
        System.out.println(ans);
    }

    public static int arrayTarget(int[] arr,int target){
        int i=0;
        while(arr[i]<target){
            i++;
            if(i==arr.length-1){
                i++;
                break;
            }
        }
        return i;
    }
}
