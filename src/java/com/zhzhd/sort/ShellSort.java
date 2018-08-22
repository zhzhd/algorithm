package com.zhzhd.sort;;
/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe 希尔是插入排序的一种更高效的改进版本。希尔排序是不稳定的排序算法。
 **/
public class ShellSort implements Sort<Integer>{
    /**
     * 分类 -------------- 内部比较排序
     * 数据结构 ---------- 数组
     * 最差时间复杂度 ---- 根据步长序列的不同而不同。已知最好的为O(n(logn)^2)
     * 最优时间复杂度 ---- O(n)
     * 平均时间复杂度 ---- 根据步长序列的不同而不同。
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
        //生成初始步长，算法最后的步长肯定为1
        int h = 0;
        while (h <= array.length){
            h = 3 * h + 1;
        }
        System.out.println("最终步长：" + h);
        //步长大于1时
        while (h >= 1){
            //i从第h个元素开始，插入排序的步长为1，希尔排序的步长是递减的
            for (int i = h; i < array.length; i ++){
                int j = i - h;
                int temp = array[i];
                while (j >= 0 && array[j] > temp){
                    array[j + h] = array[j];
                    j = j - h;
                }
                array[j + h] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }
}