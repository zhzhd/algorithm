package com.zhzhd.leetcode;

/**
 * zhzhd
 * 2018-10-20
 * algorithm
 * 最长公共子序列
 */
public class Subsequence {

    public static void main(String[] args) {
        String s1 = "fdfghi";
        String s2 = "dwedfghoi";

        System.out.println(maxSubString(s1, s2));
    }

    private static int maxSubString(String s1, String s2) {
        int dp[][] = new int[s1.length()][s2.length()];
        int i, j, max=0;

        for (i = 0; i < s1.length(); i++){
            for (j = 0; j < s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    if (i > 0 && j > 0){
                        dp[i][j] = dp[i -1][j - 1] + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                    if (max < dp[i][j]){
                        max = dp[i][j];
                    }
                }
            }
        }
        return max;
    }
}
