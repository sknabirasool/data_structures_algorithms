package com.Learning.strings;

public class RemoveDuplicateCharacters {

    public static String removeDuplicateCharacters(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(result.indexOf(str.charAt(i)) == -1){
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       String res= removeDuplicateCharacters("programming");
       System.out.println(res);
    }
}
