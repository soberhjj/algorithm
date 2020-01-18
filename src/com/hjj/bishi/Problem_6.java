package com.hjj.bishi;

import java.util.Stack;

/**
 * @author soberhjj  2020/1/18 - 16:39
 */
//题目：栈和队列
//用两个栈来实现一个队列，完成队列的Push（即入队）和Pop（出队）操作。 队列中的元素为int类型。
public class Problem_6 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
