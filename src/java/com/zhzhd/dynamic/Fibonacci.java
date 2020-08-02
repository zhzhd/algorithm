package com.zhzhd.dynamic;
/**
 *@author zhangzhendong1
 *@date 2018/8/10
 *@package com.zhzhd.dynamic
 *@describe
 **/
public class Fibonacci {

    /**
     * 递归求解斐波那契数列
     * @param n
     * @return
     */
    private static int recursion(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    private static int dynamicProgramming(int n){
        int previous = 0, current = 1;
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        for (int i = 1; i < n; i++){
            int news = previous + current;
            previous = current;
            current = news;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 40;
        long recursionStart = System.currentTimeMillis();
        System.out.println(recursion(n));
        long recursionEnd = System.currentTimeMillis();
        System.out.println(recursionEnd - recursionStart);

        long dynamicProgrammingStart = System.currentTimeMillis();
        System.out.println(dynamicProgramming(n));
        long dynamicProgrammingEnd = System.currentTimeMillis();
        System.out.println(dynamicProgrammingEnd - dynamicProgrammingStart);
    }
}