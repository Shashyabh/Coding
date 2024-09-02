package com.Contest;

public class NoOFDays {
    public static void main(String[] args) {
        int hours[]={72,48,24,3};
        int count=0;
        int n=hours.length;
        for(int i=0;i<n;i++){
            for(int j=i+i;j<n;j++){
                if((hours[i]+hours[j])%24==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
