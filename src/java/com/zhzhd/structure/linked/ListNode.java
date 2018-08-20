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
}