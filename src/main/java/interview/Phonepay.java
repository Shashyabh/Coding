package interview;

import java.util.Scanner;
import java.util.Stack;

public class Phonepay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
        //
        String str="()(]"; //{([])}   ,  ()(), [(])
        if(isMatch(str)){
            if (isEmpty(str)){
                System.out.println("Empty");
            }
            else {
                System.out.println("Matched");
            }
        }
        else{
            System.out.println("Not matched");
        }



    }

    public static boolean isEmpty(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')' && st.peek()!='('){
                    return false;
                }
                else if(ch=='}' && st.peek()!='{'){
                    return false;
                }
                else if(ch==']' && st.peek()!='['){
                    return false;
                }
                else {
                    st.pop();
                }
            }

            if(st.isEmpty() && i<str.length()-1){
                return true;
            }
        }
        return false;
    }

    public static boolean isMatch(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(ch==')' && st.peek()!='('){
                    return false;
                }
                else if(ch=='}' && st.peek()!='{'){
                    return false;
                }
                else if(ch==']' && st.peek()!='['){
                    return false;
                }
                else {
                    st.pop();
                }
            }

        }
        return st.isEmpty();
    }
}
