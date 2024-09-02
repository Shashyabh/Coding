package BossCoder.Stack;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Expression {
    public static void main(String[] args) {
        String token[]={"2","1","+","3","*"};
//        ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//                = ((10 * (6 / (12 * -11))) + 17) + 5
//                = ((10 * (6 / -132)) + 17) + 5
//                = ((10 * 0) + 17) + 5
//                = (0 + 17) + 5

        System.out.println(f(token));
    }

    public static int f(String[] str){
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<str.length;i++){
            String s=str[i];
            if(s=="+"||s=="-"||s=="*"||s=="/"){
                int a=st.pop();
                int b=st.pop();
                if(s=="+"){
                    st.push(b+a);
                }
                else if(s=="-"){
                    st.push(b-a);
                }
                else if(s=="*"){
                    st.push(b*a);
                }
                else{
                    st.push(b/a);
                }
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        return st.peek();
    }
}
