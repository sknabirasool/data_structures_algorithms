package com.Learning.strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersFrequency {

    public static void countCharFrequency(String str) {

        for(int i=0; i < str.length();i++){

            char ch=str.charAt(i);
            int count=0;

            for(int j=0;j< str.length();j++){

                if(ch==str.charAt(j)){
                    count++;
                }
            }

            System.out.println(ch+" "+count);
        }

    }

   public static void usingMapcountCharFrequency(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       System.out.println(map.toString());
   }

    public static void main(String[] args) {

        countCharFrequency("babana");

        usingMapcountCharFrequency("nanana");

    }
}
