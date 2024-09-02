package BossCoder.Array.TwoDArray;

import java.util.*;

public class WeakElement1337 {
    public static void main(String[] args) {
        int mat[][] = {{1,1,0,0,0},{1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k=3;
        int ans[]=new int[k];

        int m=mat.length;
        int n=mat[0].length;

        HashMap<Integer,Integer> map=new HashMap<>();
        int x=0;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            map.put(i,count);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(a)-map.get(b));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
