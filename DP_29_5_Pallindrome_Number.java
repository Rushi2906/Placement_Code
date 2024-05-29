public class DP_29_5_Pallindrome_Number {
    public static void main(String[] args) {
        boolean ans = palindrome(10);
        System.out.println(ans);
    }

    public static boolean palindrome(int num){
        if(num<0){
            return false;
        }else{
            int temp = num;
            int sum=0,r;
            while(num>0){
                r=num%10;
                sum=(sum*10)+r;
                num=num/10;
            }
            if(temp==sum){
                return true;
            }
            return false;
        }
    }
}
