package BossCoder.Recursion.Recursion;

public class EliminationGame {
    public static void main(String[] args) {
//        Input: n = 9
//        Output: 6
//        Explanation:
//        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        arr = [2, 4, 6, 8]
//        arr = [2, 6]
//        arr = [6]
        System.out.println(lastRemaining(32));
    }
    public static int lastRemaining(int n) {
        if(n==0|| n==1){
            return n;
        }
        return f(n,true);
    }

    public static int f(int n,boolean flag){
        if(n==1){
            return 1;
        }
        return flag?2*f(n/2,false):n%2==0? 2*f(n/2,true)-1: 2*f(n/2,true);

//        if(flag){
//            return 2*f(n/2,false);
//        }
//        else {
//            if(n%2==0){
//                return 2*f(n/2,true)-1;
//            }
//            else{
//                return 2*f(n/2,true) ;
//            }
//        }
    }
}
