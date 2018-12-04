package com.zhzhd.dynamic;
/**
 *@author zhangzhendong1
 *@date 2018/12/3
 *@package com.zhzhd.dynamic
 *@describe 有N件物品和一个容量为V的背包。（每种物品均只有一件）第i件物品的费用是c[i]，价值是w[i]。求解将哪些物品装入背包可使价值总和最大。
 **/
public class ZeroOnePack {

    public static void main(String[] args) {
        int[] vi = {200, 240, 140, 150};

        int[] wi = {1, 3, 2, 5};

        int w = 5;

        System.out.println(knapSack(w, wi, vi, 4));
        System.out.println(knapSackDP(w, wi, vi, 4));
    }

    private static int max(int a, int b){
        return (a > b) ? a : b;
    }

    private static int  knapSack(int w, int[] wi, int[] vi, int n){
        if (n == 0 || w == 0){
            return 0;
        }

        if (wi[n - 1] > w){
            return knapSack(w, wi, vi, n-1);
        } else {
            return max(vi[n - 1] + knapSack(w-wi[n-1], wi, vi, n-1), knapSack(w, wi, vi, n-1));
        }
    }

    private static int  knapSackDP(int W, int[] wi, int[] vi, int n){
        int i,w;
        int[][] k = new int[n + 1][W +1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W ; w++) {
                if (i == 0 || w == 0){
                    k[i][w] = 0;
                } else if (wi[i - 1] <= w){
                    k[i][w] = max(vi[i - 1] + k[i - 1][w - wi[i - 1]], k[i - 1][w]);
                } else {
                    k[i][w] = k[i - 1][w];
                }
            }
        }
        return k[n][W];
    }
}