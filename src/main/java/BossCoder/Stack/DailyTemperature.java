package BossCoder.Stack;

import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int [] nums={73,74,75,71,69,72,76,73};
        f(nums);
    }

    public static void   f(int[] temperatures) {

        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int ans[]=new int[n];

        for(int i=n-1;i>=0;i--){
            int currTemp=temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()]<=currTemp){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }

        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
