package com.zhzhd.dynamic;;
/**
 *@author zhangzhendong1
 *@date 2018/6/4
 *@package com.zhzhd.dynamic
 *@describe 割绳子
 *  给你一根长度为N的绳子，请把绳子剪成M段（m,n都是整数），每段绳子的长度记为k[0],k[1],k[2]…. 请问如何剪绳子使得k[0],k[1],k[2]的乘积最大
 **/
public class CutRope {

    public void cutRope(int len){
        int[] h = new int[50];

        if (len < 2){
            System.out.println(0);
        }
        if (len == 2){
            System.out.println(1);
        }
        System.out.println(h.toString());
    }
}