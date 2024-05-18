import java.util.HashMap;

public class DP_17_5_Array_ElemGreater3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2};
        element(arr);
    }

    public static void element(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i])+1;
                if(count>arr.length/3){
                    System.out.print(arr[i]+" ");
                    flag=1;
                }else{
                    map.put(arr[i], count);
                }
            }
            else{
                map.put(arr[i], 1);
            }

            
        }
        if(flag==0){
            System.out.println("No Element found for given condition");
        }
    }
}
