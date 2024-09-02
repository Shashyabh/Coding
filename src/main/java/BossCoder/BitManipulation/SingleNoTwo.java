package BossCoder.BitManipulation;

public class SingleNoTwo {
    public static void main(String[] args) {
        int input[]=new int[]{2,2,3,2};

        int ans=1;
        for(int i=0;i<input.length-1;i++){
            ans=input[i]&input[i+1];
            System.out.println(ans);
        }
        System.out.println("Final ans = "+ ans);
    }
}
