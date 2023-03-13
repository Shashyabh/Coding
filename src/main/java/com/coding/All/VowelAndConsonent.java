package com.coding.All;

public class VowelAndConsonent {
    public static void main(String[] args) {
        String str="Shashyabh";
        countVowel(str);
    }

    private static void countVowel(String str) {
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("Vowel = "+vowelCount);
        System.out.println("Consonent = "+consonantCount);
    }

    private static boolean isVowel(char ch) {
        ch=Character.toUpperCase(ch);
        return (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
}
