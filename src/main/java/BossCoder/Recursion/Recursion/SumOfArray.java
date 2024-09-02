package BossCoder.Recursion.Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(f(arr,0,0));
    }
    public static int f(int[] arr,int total,int i){
        if(i==arr.length){
            return total;
        }
        return f(arr,total+arr[i],i+1);
    }
}
