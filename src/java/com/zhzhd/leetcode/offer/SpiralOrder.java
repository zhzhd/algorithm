package com.zhzhd.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhzhd
 * @Date 2020-08-02
 * @Description
 */
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] arr = spiralOrder(matrix);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    private static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return new int[0];
        }
        int start = 0;
        int columns = matrix.length;
        int rows = matrix[0].length;
        List<Integer> result = new ArrayList<Integer>();
        while (columns > start * 2 && rows > start * 2) {
            printMatrixInCircle(matrix, columns, rows, start, result);
            start++;
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = result.get(i);
        }
        return arr;
    }

    private static void printMatrixInCircle(int [][] matrix, int columns, int rows, int start, List<Integer> result){
        int endX = columns - 1 - start;
        int endY = rows - 1 -  start;
        //从左到右打印一行
        for (int j = start; j <= endX; ++j) {
            result.add(matrix[start][j]);
        }

        //从上到下打印一列
        if (start < endY) {
            for (int j = start + 1; j <= endY; ++j) {
                result.add(matrix[j][endY]);
            }
        }

        //从右到左打印一行
        if (start < endX && start < endY) {
            for (int j = endX - 1; j >= start; -- j) {
                result.add(matrix[endY][j]);
            }
        }

        //从下到上打印一行
        if (start < endX && start < endY - 1) {
            for (int j = endY - 1; j >= start + 1; --j) {
                result.add(matrix[j][start]);
            }
        }
    }
}
