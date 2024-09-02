package BossCoder.PatternPrinting;

public class LeftHalfPyramid {

    public static void  leftHalf(int n){

        for(int i=n;i>=1;i--){

            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leftHalf(6);
    }
}
