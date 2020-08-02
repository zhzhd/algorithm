package com.zhzhd.dynamic;
/**
 *@author zhangzhendong1
 *@date 2018/11/30
 *@package com.zhzhd.leetcode
 *@describe 在股市的交易日中，假设最多可进行两次买卖(即买和卖的次数均小于等于2)，规则是必须一笔成交后进行另一笔(即买-卖-买-卖的顺序进行)。
 *          给出一天中的股票变化序列，计算一天可以获得的最大收益。
 **/
public class MaxProfit {

    public static void main(String[] args) {
        int[] samples = {10,22,50,75,65,80};
        System.out.println(getMxaProfitPartitionOneDP(samples));

    }


    private static long getMxaProfitPartitionOneDP(int[] l){
        long minProfit = Long.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < l.length ; i++) {
            minProfit = Math.min(minProfit, l[i]);
            maxProfit = Math.max(maxProfit,l[i] - minProfit);
        }
        return maxProfit;
    }

    private static long getMxaProfitPartitionTwoDP(int[] l){
        long minProfit = Long.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < l.length ; i++) {
            minProfit = Math.min(minProfit, l[i]);
            maxProfit = Math.max(maxProfit,l[i] - minProfit);
        }
        return maxProfit;
    }
}