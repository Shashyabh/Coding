package BossCoder.Hashing;

import java.util.HashMap;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s, String t) {

        String ans="";
        if(s.length()<t.length()){
            return ans;
        }

        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer>tMap=new HashMap<>();
        int curr=0;
        int total=t.length();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tMap.put(ch,tMap.getOrDefault(ch,0)+1);
        }

        int i=0;
        int j=0;
        while (j<s.length()){
            char ch=s.charAt(j);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);

            if(tMap.containsKey(ch) && sMap.get(ch)<=tMap.get(ch)){
                curr++;
            }

            while(curr==total){
                if(min>j-i+1){
                    min=j-i+1;
                    ans=s.substring(i,j+1);
                }

                char charToRemove=s.charAt(i);

                if(sMap.get(charToRemove)==1){
                    sMap.remove(charToRemove);
                }
                else{
                    sMap.put(charToRemove,sMap.get(charToRemove)-1);
                }
                i++;

                if(tMap.containsKey(charToRemove) && sMap.getOrDefault(charToRemove,0)<(tMap.get(charToRemove))){
                    curr--;
                }
            }

            System.out.println(sMap +"  "+tMap);
            j++;

        }
        return ans;
    }
}
