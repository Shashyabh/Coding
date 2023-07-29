package com.coding.Heap;

import java.util.*;

public class TaskSchudler {
    public static void main(String[] args) {
        char[] arr={'A','A','A','B','B','B'};
        System.out.println(leastInterval(arr,2));
    }
    public static int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map=new HashMap<>();

        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());

        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        pq.addAll(map.values());

        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<=n;i++){
                if(!pq.isEmpty()){
                    int count=pq.poll();
                    count--;
                    if(count>0){
                        temp.add(count);
                    }
                }

                time+=1;
                if(pq.size() == 0 && temp.size() == 0) {
                    break;
                }
            }
            pq.addAll(temp);
        }
        return time;
    }
}
