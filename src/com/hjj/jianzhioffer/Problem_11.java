package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/23 - 9:30
 */
//题目：矩形覆盖
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
//请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//本题也是斐波那契数列的应用。
public class Problem_11 {
    public int RectCover(int target) {
        if (target<=0)
            return 0;
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        return RectCover(target-1)+RectCover(target-2);
    }
}