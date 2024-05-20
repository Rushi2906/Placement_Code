public class DP_19_5_Array_RightGreater {
    public static void main(String[] args) {
        int[] arr = {4,1,8,3,6,9,7};
        demo(arr);
    }

    public static void demo(int[] arr){
        for(int i=0;i<arr.length;i++){
            int flag = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
