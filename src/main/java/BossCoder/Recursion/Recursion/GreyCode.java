package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreyCode {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        f(0,2,"",ans);
        System.out.println(ans);
    }

    public static void f(int index,int n, String s,List<Integer> temp){
        if(s.length()==n){
            int x=convertToDecimal(s);
            temp.add(x);
            return;
        }

        for(int i=index;i<n;i++){
            f(i+1,n,s+'0',temp);
            f(i+1,n,s+'1',temp);
        }
    }

    public static int convertToDecimal (String s){

        int total=0;
        int k=0;
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') {
                total = total +(int)Math.pow(2,k);
            }
            k++;
        }
        return total;
    }
}
