package com.AdvJava.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class ElementFrq {
        // Method to check if two strings are anagrams
        private static boolean areAnagrams(String str1, String str2) {
            // If the lengths of the strings are different, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to char arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted char arrays
            return Arrays.equals(arr1, arr2);
        }

        // Method to count anagram strings in an array
        public static int countAnagramStrings(String[] array) {
            int count = 0;
            Map<String, Integer> anagramMap = new HashMap<>();

            // Iterate through the array
            for (int i = 0; i < array.length; i++) {
                // Check if the current string is already counted as an anagram
                if (anagramMap.containsKey(array[i])) {
                    count += anagramMap.get(array[i]);
                    continue;
                }

                int anagramCount = 0;
                // Compare the current string with every other string
                for (int j = i + 1; j < array.length; j++) {
                    if (areAnagrams(array[i], array[j])) {
                        anagramCount++;
                    }
                }
                // Update count and map
                count += anagramCount;
                anagramMap.put(array[i], anagramCount);
            }

            return count;
        }

        public static void main(String[] args) {
            String[] strings = {"listen", "silent", "hello", "world", "act", "cat", "dog", "god"};
            int anagramCount = countAnagramStrings(strings);
            System.out.println("Number of anagram strings in the array: " + anagramCount);
        }
    }
