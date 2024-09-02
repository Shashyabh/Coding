package BossCoder.Recursion.Recursion;

import java.util.List;

public class ExpressionAndOperator {
    public static void main(String[] args) {
        System.out.println(addOperators("123",6));
    }
    public static List<String> addOperators(String num, int target) {
//        char [] exp={'+','-','*','/'};
        String [] exp={"+","-","*","/"};
        return null;

    }
    public static void f(int index,String num,int target,String s,String[]exp,List<String>ans){
        if(index==num.length()){
            if(target==0){
                ans.add(s);
            }
            return;
        }

        for(int i=index;i<exp.length;i++){

        }

    }
}
