package com.zhzhd.sort;
/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe
 * 1、从第一个元素开始，该元素可以认为已经被排序
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 5、将新元素插入到该位置后
 * 6、重复步骤2~5
 **/
public class InsertionSort implements Sort<Integer>{
    /**
     * 分类 -------------- 内部比较排序
     * 数据结构 ---------- 数组
     * 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
     * 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
     * 平均时间复杂度 ---- O(n^2)
     * 所需辅助空间 ------ O(1)
     * 稳定性 ------------ 稳定
     * 参考---http://www.cnblogs.com/eniac12/p/5329396.html
     * @param array 待排序的入参数组
     * @return
     */
    public Integer[] sort(Integer[] array) throws Exception {
        if (array == null){
            return null;
        }
        if (array.length <= 1){
            return array;
        }
        //从0开始遍历，i前面都是已排好序的
        for (int i = 0; i < array.length; i++){
            //取下标为i的值
            int temp = array[i];
            //j为i的前一个位置
            int j = i - 1;
            //当j不为负值，且前面取到的值比位置j上的值小，位置j上的值后移
            while (j >= 0 && temp < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            //将值插入
            array[j + 1] = temp;
        }
        return array;
    }
}