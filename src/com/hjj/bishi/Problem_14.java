package com.hjj.bishi;

/**
 * @author soberhjj  2020/1/23 - 10:58
 */
//题目：调整数组顺序使奇数位于偶数前面
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
//思路：本题类似冒泡排序
public class Problem_14 {
    public void reOrderArray(int[] array) {
        int change = 1;  //标志变量change
        for (int i = 0; i < array.length; i++) {
            if (change == 1) {
                change = 0;
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] % 2 == 1 && array[j - 1] % 2 != 1) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        change = 1;
                    }
                }
            }
            else
                break;
        }
    }
}
