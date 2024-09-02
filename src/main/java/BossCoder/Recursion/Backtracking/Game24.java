package BossCoder.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game24 {
    public static void main(String[] args) {
        int [] nums={4,1,8,7};
        System.out.println(judgePoint24(nums));
    }
    public static boolean judgePoint24(int[] cards) {
        List<Double> list=new ArrayList<>();

        for(int card:cards){
            list.add((double)card);
        }
        return f(list);
    }

    public static boolean f(List<Double> list){
        if(list.size()==1){
            return Math.abs(list.get(0)-24)<0.001;
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                List<Double> possList=generatePossibilities(list.get(i),list.get(j));
                System.out.println("possList"+possList);
                for(double possible:possList){
                    List<Double> nextRound = new ArrayList();
                    nextRound.add(possible);

                    for(int k=0;k<list.size();k++){
                        if(k==i || k==j) continue;
                        nextRound.add(list.get(k));
                    }

                    if(f(nextRound)) return true;
                }
            }
        }
        return false;
    }

    public static List<Double> generatePossibilities(double a, double b){
        //a+b == b+a
        //a*b ==b*a so we have neglected one
        return Arrays.asList(a+b,a-b,b-a,a*b,a/b,b/a);
    }
}
