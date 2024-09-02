package BossCoder.Math;

public class Gcd {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int nums []= {2,5,6,9,10};

        for(int a:nums){
            max=Math.max(a,max);
            min=Math.min(a,min);
        }

        int result=min;
        while(result>0){
            if(max % result==0 && min % result==0){
                break;
            }
            result--;
        }

        System.out.println("GCD in 1st Way = "+result);


        int a=max;
        int b=min;

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD in 2nd Way = "+a);


        System.out.println("GCD in 3rd Way "+gcd(a,b));

    }

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
