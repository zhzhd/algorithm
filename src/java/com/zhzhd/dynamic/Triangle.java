package com.zhzhd.dynamic;
/**
 *@author zhangzhendong1
 *@date 2018/12/3
 *@package com.zhzhd.dynamic
 *@describe 给定三角形，求解最短路径
 **/
public class Triangle {

    public int minimumTotal(int[][] triangle) {
        if (triangle == null || triangle.length == 0){
            return 0;
        }

        int[] last = new int[triangle.length];

        int[] current = new int[triangle.length];

        last[0] = triangle[0][0];
        current[0] = last[0];
        for (int i = 0; i < triangle.length ; i++) {
            for (int j = 0; j < i + 1; j++) {
                int sum = Integer.MAX_VALUE;
                if (j != 0){
                    sum = triangle[i][j] + last[j - 1];
                }

                if (j != i){
                    sum = Math.min(sum, triangle[i][j] + last[j]);
                }

                current[j] = sum;
            }

            for (int j = 0; j < i + 1; j++) {
                last[j] = current[j];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < current.length; i++) {
            min = Math.min(current[i], min);
        }
        return min;
    }
}