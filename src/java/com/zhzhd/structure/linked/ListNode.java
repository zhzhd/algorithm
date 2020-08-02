package com.zhzhd.structure.linked;;
/**
 *@author zhangzhendong1
 *@date 2018/8/10
 *@package com.zhzhd.structure.linked
 *@describe
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static ListNode buildListByArray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode next = head;
        for (int i = 1; i < arr.length; i++) {
            next.next = new ListNode(arr[i]);
            next = next.next;
        }
        return head;
    }
}