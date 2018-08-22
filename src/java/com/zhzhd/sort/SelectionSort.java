package com.zhzhd.sort;
/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe 初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 **/
public class SelectionSort implements Sort<Integer>{

    /**
     * 分类 -------------- 内部比较排序
     * 数据结构 ---------- 数组
     * 最差时间复杂度 ---- O(n^2)
     * 最优时间复杂度 ---- O(n^2)
     * 平均时间复杂度 ---- O(n^2)
     * 所需辅助空间 ------ O(1)
     * 稳定性 ------------ 不稳定
     * 参考---http://www.cnblogs.com/eniac12/p/5329396.html
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
            //未排序数组的下标
            int min = i;
            //选出未排序数组中最小的下标
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            //将最下的数放到未排序数组最前面，因为需要交换，顺序可能变化，是不稳定的排序
            if (min != i){
                SortUtil.swap(array, min, i);
            }
        }
        return array;
    }
}