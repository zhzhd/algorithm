package com.zhzhd.sort;

;

/**
 * @author zhangzhendong1
 * @date 2018/6/5
 * @package com.zhzhd.sort
 * @describe
 **/
public interface Sort<T> {

    /**
     * 排序方法
     * @param array 待排序的入参数组
     * @return 返回排序后的数组
     * @throws Exception
     */
    T[] sort(T[] array) throws Exception;
}
