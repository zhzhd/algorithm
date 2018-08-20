package com.zhzhd.sort;;
/**
 *@author zhangzhendong1
 *@date 2018/6/5
 *@package com.zhzhd.sort
 *@describe
 **/
public class SortUtil {
    /**
     * 根据下标交换数组值
     * @param array
     * @param i
     * @param j
     */
    public static void swap(Integer[] array, int i, int j) throws Exception{
        if (array == null){
            throw new NullPointerException();
        }
        if (i < 0 || i >= array.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j < 0 || j >= array.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}