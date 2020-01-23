package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/23 - 15:52
 */
//题目：合并两个排序的链表
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Problem_17 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 != null && list2 == null)
            return list1;
        if (list2 != null && list1 == null)
            return list2;
        ListNode newList = new ListNode(0); //newList作为头结点
        ListNode tail = newList; //tail作为尾结点
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode temp = list1.next;
                tail.next = list1;
                tail = tail.next;
                list1 = temp;
            } else {
                ListNode temp = list2.next;
                tail.next = list2;
                tail = tail.next;
                list2 = temp;
            }
        }
        if (list1 != null) {
            while (list1 != null) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
        } else {
            while (list2 != null) {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        tail.next = null;
        return newList.next;
    }
}
