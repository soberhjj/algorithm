package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/23 - 11:53
 */
//反转链表
//输入一个链表，反转链表后，输出新链表的表头。
//思路：头插法
public class Problem_16 {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head.next;
        head.next = null; //表头变表尾
        while (p != null) {
            ListNode next = p.next;
            p.next=head;
            head = p;
            p = next;
        }
        return head;
    }
}
