package BossCoder.Recursion.Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        int num=fact(n);
        System.out.println(num);
    }

    public static int fact(int n){
        if(n<=0){
            return 1;
        }
        return n*fact(n-1);
    }
}

//5*24
//4*6
//3*2
//2*1
//1*1
