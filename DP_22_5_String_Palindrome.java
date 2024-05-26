public class DP_22_5_String_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        boolean ans= palindrome(s);
        boolean ans2= palindrome(s2);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static boolean palindrome(String s){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        String temp = s.toLowerCase();
        char[] ch1 = temp.toCharArray();

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]>=97 && ch1[i]<=122){
                str1.append(ch1[i]);
            }
        }

        for(int i=ch1.length-1;i>=0;i--){
            if(ch1[i]>=97 && ch1[i]<=122){
                str2.append(ch1[i]);
            }  
        }

        if(str1.toString().equals(str2.toString())){
            return true;
        }else{
            return false;
        }
    }
}
