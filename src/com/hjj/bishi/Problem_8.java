package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/18 - 18:12
 */
//题目：斐波那契数列
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
// （从0开始，第0项为0）。n<39
public class Problem_8 {
    public int Fibonacci(int n) {  //非递归方式
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int temp1 = 0, temp2 = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = temp1 + temp2;
            temp1 = temp2;
            temp2 = result;
        }
        return result;
    }

    public int FibonacciRecursion(int n) {   //递归方式
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;     //递归出口
        return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(new Problem_8().FibonacciRecursion(8));
    }
}
