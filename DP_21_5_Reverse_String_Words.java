public class DP_21_5_Reverse_String_Words {
    public static void main(String[] args) {
        reverseStringWord("this is an amazing program");
        solution2("this is an amazing program");
    }

    public static void reverseStringWord(String s){
        int length = 0;
        char[] ch = s.toCharArray();

        //count the no of word in the String
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                length++;
            }
        }
        String[] str = new String[length+1];
        length=0;

        String st ="";
        // store the word in the string array
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                st=st+ch[i];
            }else{
                str[length]=st.toString();
                length++;
                st="";
            }
        }
        str[length]=st;
        
        //reverse the string array
        for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1]=temp;
        }

        //convert array into the string
        String ans = "";
        for(int i=0;i<str.length;i++){
            if(i==str.length-1){
                ans=ans+str[i];    
            }else{
                ans=ans+str[i]+" ";
            }
        }
        System.out.println(ans);
    }

    public static void solution2(String s) {
        StringBuilder st = new StringBuilder();
        String[] arr = s.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            st.append(arr[i]+" ");
        }

        System.out.println(st.toString());
    }
}
