package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/18 - 23:12
 */
//题目：变态跳台阶
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
//求该青蛙跳上一个n级的台阶总共有多少种跳法。
//本题与Problem_9跳台阶 参考：https://blog.csdn.net/Darlin_F/article/details/81278995
//本题也是斐波那契数列的应用
public class Problem_10 {
    public int JumpFloorII(int target) {
        if (target < 0)
            return 0;
        if (target == 0 || target == 1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
