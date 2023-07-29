package com.coding.SlidingWindow;

public class MInWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char ch : t.toCharArray()) {
            map[ch]++;
        }
        int i = 0;
        int j = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int counter = t.length();

        while (j < s.length()) {

            char ch1 = s.charAt(j);
            if (map[ch1] > 0) {
                counter--;
            }
            map[ch1]--;
            j++;

            while (counter == 0) {
                if (minLen > j - i) {
                    minLen = j - i;
                    minStart = i;
                }

                char ch2 = s.charAt(i);
                map[ch2]++;

                if (map[ch2] > 0) {
                    counter++;
                }
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
