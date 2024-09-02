package BossCoder.Stack;

import java.util.Stack;

public class Minimum_Add_Parentheses_Valid {
    public static void main(String[] args) {
        String str="())";
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int count=0;
        int open=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                open++;
            }
            else{
                while(!st.isEmpty() && open>0 ){
                    st.pop();
                    open--;
                }
                open=0;
                st.push(ch);
            }
        }
        return st.size();
    }
}
