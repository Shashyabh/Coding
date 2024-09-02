package BossCoder.Recursion.Recursion;

public class CountGoodNumber {
    static int mod=1000000007;
    public static void main(String[] args) {
        int n=1924;
        long odd=n/2;
        long even=n/2+n%2;

        long evenSum=f(4,odd)%mod;
        long oddSum=f(5,even)%mod;
        System.out.println((evenSum+oddSum)%mod);
    }


    public static long f(long x ,long n){

        if(n==0){
            return 1;
        }
        if(n==1) return x;
        return n%2==0?f((x*x)%mod,n/2) : f(x,n-1);
    }
}
