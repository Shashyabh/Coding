package com.coding.DSA.StackandQueue;

import java.util.Stack;

public class ValidParamthesis {
    public static void main(String[] args) {
        String str="([]){}[]";
        boolean b=valid(str);
        System.out.println(b);
    }

    public static boolean valid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (ch==')'){
                    if (st.isEmpty()||st.pop()!='('){
                        return false;
                    }
                }
                if (ch=='}'){
                    if (st.isEmpty()||st.pop()!='{'){
                        return false;
                    }
                }
                if (ch==']'){
                    if (st.isEmpty()||st.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
