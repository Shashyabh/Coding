package BossCoder.Recursion.Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=-8;
        System.out.println(f(Math.abs(n)));
    }

    public static boolean f(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0) {
            return false;
        }
        return f(n/2);
    }
}
