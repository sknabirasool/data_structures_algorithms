package com.Learning.strings;

public class CountVowels {
    public static void countVowels(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if("aeiou".indexOf(str.charAt(i)) >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        countVowels("programming");
    }
}
