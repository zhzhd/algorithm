package com.zhzhd.leetcode;

/**
 * zhzhd
 * 2018-10-20
 * algorithm
 * 颠倒两个字符串中字母的顺序，能否使两个字符串一样
 */
public class Anagram {

    public static boolean anagram(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()){
            return false;
        }

        final int CHAR_NUM = 256;

        int[] letterCount = new int[CHAR_NUM];

        for (int i = 0; i != s1.length(); i++){
            letterCount[s1.charAt(i)]++;
            letterCount[s2.charAt(i)]--;
        }

        for (int i = 0; i != CHAR_NUM; i++){
            if (letterCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "hwokcdl11";

        String s2 = "wkcdloh11";

        System.out.println(anagram(s1, s2));
    }
}
