package com.zhzhd.sort;;
/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe 冒泡排序
 * 它重复地走访过要排序的元素，依次比较相邻两个元素，如果他们的顺序错误就把他们调换过来，直到没有元素再需要交换，排序完成
 * 1、比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
 * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3、针对所有的元素重复以上的步骤，除了最后一个。
 * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 参考---http://www.cnblogs.com/eniac12/p/5329396.html
 **/
public class BubbleSort implements Sort<Integer>{
    /**
     * 分类 -------------- 内部比较排序
     * 数据结构 ---------- 数组
     * 最差时间复杂度 ---- O(n^2)
     * 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
     * 平均时间复杂度 ---- O(n^2)
     * 所需辅助空间 ------ O(1)
     * 稳定性 ------------ 稳定
     * @param array 待排序的入参数组
     * @return
     */
    public Integer[] sort(Integer[] array) throws Exception{
        if (array == null){
            return null;
        }
        if (array.length <= 1){
            return array;
        }
        //从0开始遍历
        for (int i = 0; i < array.length; i++){
            //从0开始，直到已排好序的数组之前，选择未排序数组中最大的，放到已排序数组前面
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtil.swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}