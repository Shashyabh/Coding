package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses {
    public static void main(String[] args) {
//        Input: expression = "2*3-4*5"
//        Output: [-34,-14,-10,-10,10]
//        Explanation:
//        (2*(3-(4*5))) = -34
//        ((2*3)-(4*5)) = -14
//        ((2*(3-4))*5) = -10
//        (2*((3-4)*5)) = -10
//        (((2*3)-4)*5) = 10

        String expression = "2*3-4*5";
//        String expression = "2-1-1";
        System.out.println(f(expression));
    }

    public static List<Integer> f(String str){

        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                List<Integer> left=f(str.substring(0,i));
                List<Integer> right=f(str.substring(i+1));
                System.out.println(left);
                System.out.println(right);
                for(Integer a:left){
                    for(Integer b:right){
                        if(ch=='+'){
                            ans.add(a+b);
                        }
                        else if(ch=='-'){
                            ans.add(a-b);
                        }
                        else if(ch=='*'){
                            ans.add(a*b);
                        }
                    }
                }
            }
        }

        if(ans.size()==0){
            ans.add(Integer.valueOf(str));
        }
        System.out.println("ans = "+ans);
        return ans;
    }
}
