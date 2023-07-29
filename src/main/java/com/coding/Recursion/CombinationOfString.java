package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfString {
    public static void main(String[] args) {
        String s="abca";
        f(s,"",0);
        List<String> uniqueSubsequences = new ArrayList<>();
        System.out.println(generateUniqueSubsequencesHelper(s, "", uniqueSubsequences));
    }
    public static void f(String s, String str,int i){
        if (s.length()==0){
            System.out.println(str);
            return;
        }
        f(s.substring(1),str+s.charAt(0),i+1);
        f(s.substring(1),str,i+1);
    }

    private static List<String> generateUniqueSubsequencesHelper(String s, String current, List<String> uniqueSubsequences) {
        if (s.length() == 0) {
            if (!uniqueSubsequences.contains(current)) {
                uniqueSubsequences.add(current);
            }
        } else {
            // Ignore the current character and move on to the next one
            generateUniqueSubsequencesHelper(s.substring(1), current, uniqueSubsequences);

            // Include the current character in the subsequence
            generateUniqueSubsequencesHelper(s.substring(1), current + s.charAt(0), uniqueSubsequences);
        }
        return uniqueSubsequences;
    }

}
