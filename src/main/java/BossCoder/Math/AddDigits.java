package BossCoder.Math;

public class AddDigits {
    public static void main(String[] args) {
        int n=38;
        int sum=n;
        if(n==0){
            return;
        }

        int total=0;

        while(sum>10){
            int rem=sum%10;
            sum=sum/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
