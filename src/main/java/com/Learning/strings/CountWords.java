package com.Learning.strings;

import java.util.StringTokenizer;

public class CountWords {

    public static void countWords(String str) {

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
    }
    public static void main(String[] args) {

        countWords("welcome to java Programming");
    }
}
