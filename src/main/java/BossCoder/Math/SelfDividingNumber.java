package BossCoder.Math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {

        int left = 1, right = 22;
        List<Integer> ans =new ArrayList<>();

        for(int i=left;i<=right;i++){
            int n=i;
            boolean flag=false;;
            while(n>0){
                int rem=n%10;
                if(rem==0){
                    break;
                }
                if(i%rem!=0){
                    flag=true;
                }
                n=n/10;
            }
            if(flag==false){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }

}
