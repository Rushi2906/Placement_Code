public class DP_18_5_Pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    // 1      1
    // 12    21
    // 123  321
    // 12344321
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }
                else if(j>i && j<(2*n-i+1)){
                    System.out.print("  ");
                }
                else{
                    System.out.print(2*n-j+1+" ");
                }
                // if(j>=(2*n-i+1)){
                // }
            }
            System.out.println();
        }
    }
}
