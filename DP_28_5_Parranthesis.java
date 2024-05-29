import java.util.Stack;

public class DP_28_5_Parranthesis {
    public static void main(String[] args) {
        paranthesis("{[]}");
    }

    public static void paranthesis(String s){
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
                st.push(ch[i]);
            }else if(ch[i]==')' && st.peek()=='('){
                st.pop();
            }else if(ch[i]=='}' && st.peek()=='{'){
                st.pop();
            }else if(ch[i]==']' && st.peek()=='['){
                st.pop();
            }else{
                continue;
            }
        }

        if(st.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
