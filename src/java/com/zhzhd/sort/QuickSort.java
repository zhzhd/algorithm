package com.zhzhd.sort;;
/**
 *@author zhangzhendong1
 *@date 2018/8/20
 *@package com.zhzhd.sort
 *@describe
 * 1、从序列中挑出一个元素，作为"基准"(pivot)。
 * 2、把所有比基准值小的元素放在基准前面，所有比基准值大的元素放在基准的后面（相同的数可以到任一边），这个称为分区(partition)操作。
 * 3、对每个分区递归地进行步骤1~2，递归的结束条件是序列的大小是0或1，这时整体已经被排好序了。
 * 参考---http://www.cnblogs.com/eniac12/p/5329396.html
 **/
public class QuickSort implements Sort<Integer>{
    /**
     * 分类 ------------ 内部比较排序
     * 数据结构 --------- 数组
     * 最差时间复杂度 ---- 每次选取的基准都是最大（或最小）的元素，导致每次只划分出了一个分区，需要进行n-1次划分才能结束递归，时间复杂度为O(n^2)
     * 最优时间复杂度 ---- 每次选取的基准都是中位数，这样每次都均匀的划分出两个分区，只需要logn次划分就能结束递归，时间复杂度为O(nlogn)
     * 平均时间复杂度 ---- O(nlogn)
     * 所需辅助空间 ------ 主要是递归造成的栈空间的使用(用来保存left和right等局部变量)，取决于递归树的深度，一般为O(logn)，最差为O(n)
     * 稳定性 ---------- 不稳定
     * @param array 待排序的入参数组
     * @return
     * @throws Exception
     */
    public Integer[] sort(Integer[] array) throws Exception {
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        return array;
    }

    void quickSort(Integer[] sort, int left, int right){
        if (left >= right){
            return;
        }
        int pivot_index = partition(sort, left, right);
        quickSort(sort, left, pivot_index - 1);
        quickSort(sort, pivot_index + 1, right);
    }
    int partition(Integer[] sort, int left, int right){
        int pivot = sort[right];
        int tail = left - 1;
        for (int i = left; i < right; i++)
        {
            if (sort[i] <= pivot)
            {
                swap(sort, ++tail, i);
            }
        }
        swap(sort, tail + 1, right);
        return tail + 1;
    }

    void swap(Integer[] sort, int i, int j)
    {
        int temp = sort[i];
        sort[i] = sort[j];
        sort[j] = temp;
    }

}