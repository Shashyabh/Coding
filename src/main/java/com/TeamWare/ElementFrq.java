package com.TeamWare;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ElementFrq {
    public static void main(String[] args) {
        // divya ,vidya ,idvya, hello ,elloh
        //divya:3 hello :2
        //adivy
        List<String> names = Arrays.asList("vidya","divya","idvya","hello","elloh");

        List<String> namess = Arrays.asList("vidyaaa","ddbjfivya","idvydbhjbdba","dbhbdd","bdhhelloh");


        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<names.size();i++){
            char[] c = names.get(i).toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(map.get(str)==null){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }

        for(int i=0;i<names.size();i++){
            char[] c = names.get(i).toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(!map.containsKey(str)){
                continue;
            }
            System.out.println(names.get(i)+" "+map.get(str));
            map.remove(str);
        }
    }
}
