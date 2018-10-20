package com.zhzhd.sort;;import java.util.Arrays;

/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe
 **/
public class SortTest {
    private static Sort<Integer> sort;
    private static Integer[] array = {2, 9, 3, 1, 5, 8, 4};
    public static void main(String[] args) {
        Integer[] result = null;
        //冒泡排序
//        sort = new BubbleSort();
        //快速排序
//        sort = new SelectionSort();
        //插入排序
//        sort = new InsertionSort();
        //希尔排序
//        sort = new ShellSort();
        //归并排序
//        sort = new MergeSort();
        //快速排序
        sort = new QuickSort();
        int[] a = null;
        System.out.println(a.length);
        try {
            result = sort.sort(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(result));

    }
}