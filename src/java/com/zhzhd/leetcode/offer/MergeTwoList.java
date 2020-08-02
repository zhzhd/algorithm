package com.zhzhd.leetcode.offer;

import com.zhzhd.structure.linked.ListNode;

/**
 * @Author zhzhd
 * @Date 2020-08-01
 * @Description
 */
public class MergeTwoList {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode l3 = mergeToLists(ListNode.buildListByArray(arr1), ListNode.buildListByArray(arr2));

    }

    public static ListNode mergeToLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        ListNode newL;
        if(l1.val <= l2.val) {
            newL = l1;
            l1 = l1.next;
        } else {
            newL = l2;
            l2 = l2.next;
        }
        ListNode l3 = newL;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                l3.next = l1;
                l1= l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1 != null) {
            l3.next = l1;
        } else {
            l3.next = l2;
        }
        return newL;
    }
}
