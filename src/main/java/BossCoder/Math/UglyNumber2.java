package BossCoder.Math;

public class UglyNumber2 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int i) {
        if(i==1){
            return 1;
        }
        if(i==2){
            return 2;
        }
        if(i==3){
            return 3;
        }
        if(i==4){
            return 4;
        }
        if(i==5){
            return 5;
        }
        if(i==6){
            return 6;
        }

        int count=0;

        for(int j=7;j<=i;j++){
            if(isPrime(j)){
                count++;
            }
        }
        System.out.println(count);

        return i+count;

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // other even numbers are not prime
        }
        for (int i = 3; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
