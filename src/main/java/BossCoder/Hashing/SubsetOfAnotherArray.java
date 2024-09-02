package BossCoder.Hashing;

import java.util.HashMap;

public class SubsetOfAnotherArray {
    public static void main(String[] args) {
        int []arr1={11,1,13,21,3,7};
        int arr2[]={11,3,7,3};

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr1){
            map.put(a, map.getOrDefault(a,0)+1);
        }

        boolean flag=false;

        for(int a:arr2){

            if(map.containsKey(a)){
                if(map.get(a)<1){
                    flag=true;
                    break;
                }
                map.put(a,map.get(a)-1);
            }
            else {
                flag=true;
                break;
            }
        }
        System.out.println(flag==true?"Not a subset":"Subset");
    }
}
