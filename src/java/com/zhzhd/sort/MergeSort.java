package com.zhzhd.sort;

import java.util.Arrays;

/**
 *@author zhangzhendong1
 *@date 2018/8/20
 *@package com.zhzhd.sort
 *@describe
 * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 * 4、重复步骤3直到某一指针到达序列尾
 * 5、将另一序列剩下的所有元素直接复制到合并序列尾
 * 参考---http://www.cnblogs.com/eniac12/p/5329396.html
 **/
public class MergeSort implements Sort<Integer>{

    /**
     *  数据结构 ---------- 数组
     *  最差时间复杂度 ---- O(nlogn)
     *  最优时间复杂度 ---- O(nlogn)
     *  平均时间复杂度 ---- O(nlogn)
     *  所需辅助空间 ------ O(n)
     *  稳定性 ------------ 稳定
     * @param array 待排序的入参数组
     * @return
     * @throws Exception
     */
    public Integer[] sort(Integer[] array) throws Exception {
        if (array == null){
            return null;
        }
        if (array.length <= 1){
            return array;
        }
        //递归
//        recursion(array, 0, array.length);
        //迭代
        iteration(array, array.length);
        return array;
    }

    void merge(Integer[] sort, int left, int mid, int right){
        int length = right - left + 1;
        int[] temp = new int[length];
        int index = 0;
        //合并前第一数组的起始位置
        int i = left;
        //合并前第二数组的开始位置
        int j = mid + 1;
        while (i <= mid && j <= right){
            temp[index++] = sort[i] <= sort[j] ? sort[i++] : sort[j++];
        }
        while (i <= mid){
            temp[index++] = sort[i++];
        }
        while (j <= right){
            temp[index++] = sort[j++];
        }
        for (int k = 0; k < length; k++){
            sort[left++] = temp[k];
        }
    }

    /**
     * 递归方法
     * @param sort
     * @param left
     * @param right
     */
    void recursion(Integer[] sort, int left, int right){
        if (left == right){
            return;
        }
        int mid = (left + right) / 2;
        recursion(sort, left, mid);
        recursion(sort, mid + 1, right);
        merge(sort, left, mid, right);
    }

    /**
     * 迭代
     * @param sort
     * @param length
     */
    void iteration(Integer[] sort, int length){
        // 子数组索引,前一个为sort[left...mid]，后一个子数组为sort[mid+1...right]
        int left, mid, right;
        // 子数组的大小i初始为1，每轮翻倍
        for (int i = 1; i < length; i *= 2){
            left = 0;
            // 后一个子数组存在(需要归并)
            while (left + i < length){
                mid = left + i - 1;
                right = mid +i < length ? mid + i : length - 1;
                merge(sort, left, mid, right);
                left = right + 1;
            }
        }
    }
}