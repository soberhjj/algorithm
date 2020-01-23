package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/23 - 11:30
 */
//题目：链表中倒数第k个结点
//输入一个链表，输出该链表中倒数第k个结点。
public class Problem_15 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (k<=0)
            return null;
        ListNode p = head;
        while (k > 1 && p != null) {
            p = p.next;
            k--;
        }
        if (p == null)
            return null;
        else {
            ListNode pre = head;
            while (p.next != null) {
                p = p.next;
                pre = pre.next;
            }
            return pre;
        }
    }
}


