package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/18 - 17:09
 */
//题目：旋转数组得最小数字
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//（注意非递减并不是就是递增，还可能含重复值，比如{1，2，3，3，4，5，5}）
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

//待解决：只有部分case通过
public class Problem_7 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] > array[high])
                low = middle + 1;
            if (array[middle] < array[high])
                high = middle;
            if (array[middle]==array[high])
                high-=1;
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] array={1};
        System.out.println(new Problem_7().minNumberInRotateArray(array));
    }
}
