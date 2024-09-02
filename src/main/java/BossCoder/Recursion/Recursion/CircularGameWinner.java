package BossCoder.Recursion.Recursion;

public class CircularGameWinner {
    public static void main(String[] args) {
        int n=5;
        int k=2;

       int ans=f(n,k)+1;
        System.out.println(ans);
    }

    public static int f(int n,int k){
        if(n==1){
            return 0;
        }

        int x=f(n-1,k);
        int y=(x+k)%n;
        return y;
    }
}
