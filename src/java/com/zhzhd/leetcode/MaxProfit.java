package com.zhzhd.leetcode;;
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
        System.out.println(getMxaProfitPartitionOne(samples, 0, samples.length, 0, 0));

    }

    private static int getMxaProfitPartitionOne(int[] l, int start, int end, int max, int min){
        //start 到 end 的最大值和最小值
        if (start == end){
            max = l[start];
            min = l[start];
            return max - min;
        }
        int mid = (start + end) / 2;
        int maxProfitL = getMxaProfitPartitionOne(l, start, mid, max, min);
        int maxProfitR = getMxaProfitPartitionOne(l, mid, end, max, min);
        int maxProfitM = max - min;
        int maxProfit = (maxProfitL > maxProfitR) ? maxProfitL : maxProfitR;

        maxProfit = (maxProfit > maxProfitM) ? maxProfit : maxProfitM;

        return maxProfit;
    }
}