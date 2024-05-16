import java.util.Scanner;

public class DP_16_5_Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row No : ");
        int row = sc.nextInt();
        System.out.println("Enter Col No : ");
        int col = sc.nextInt();
        int ans = pascal(row, col);
        System.out.println("Answer : "+ans);
    }

    //Formula to find pascal traingle value
    // nCr where n = row-1 & r = col-1
    // nCr = n! / (r! * (n-r)!)

    public static int pascal(int row,int col){
        int n = factorial(row-1);
        int r = factorial(col-1);
        int t = factorial(row-col);
        return n / (r*t);
    }

    public static int factorial(int n){
        if(n>=1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }
}
