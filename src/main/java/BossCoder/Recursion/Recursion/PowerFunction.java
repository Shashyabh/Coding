package BossCoder.Recursion.Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        double x=2;
        int n=10;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        return f(x,n,1);
    }

    public static double f(double x ,int n, double ans){
        if(n==0){
            return ans;
        }
        return n%2==0?f(x*x,n/2,ans) : f(x,n-1,x*ans);
    }
}
