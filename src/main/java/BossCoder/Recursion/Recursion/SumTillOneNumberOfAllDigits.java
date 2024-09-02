package BossCoder.Recursion.Recursion;

public class SumTillOneNumberOfAllDigits {
    public static void main(String[] args) {
        int n=12;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n<=0){
            return n;
        }
        return (n%9==0 ?9:n%9);
    }
}
