package com.hjj.bishi;

import java.util.ArrayList;

/**
 * @author soberhjj  2020/1/18 - 15:30
 */
//题目：从头到尾打印链表。
// 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
//思路：使用递归解决
public class Problem_4 {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {       //递归出口
            return arrayList;
        }
        printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        return arrayList;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}