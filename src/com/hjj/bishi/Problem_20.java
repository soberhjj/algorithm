package com.hjj.bishi;

import java.util.ArrayList;

/**
 * @author soberhjj  2020/1/28 - 11:40
 */
//题目：顺时针打印矩阵
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
//例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class Problem_20 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int row = matrix.length, col = matrix[0].length;
        // 输入的二维数组非法，返回空的数组
        if (row == 0 || col == 0) return res;
        // 定义四个关键变量，表示左上和右下的打印范围
        int left = 0, top = 0, right = col - 1, bottom = row - 1;
        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <= right; ++i) res.add(matrix[top][i]);
            // top to bottom
            for (int i = top + 1; i <= bottom; ++i) res.add(matrix[i][right]);
            // right to left
            if (top != bottom)  //加入这个条件判断是为了防止单行的情况
                for (int i = right - 1; i >= left; --i) res.add(matrix[bottom][i]);
            // bottom to top
            if (left != right)  //加入这个条件判断是为了防止单列的情况
                for (int i = bottom - 1; i > top; --i) res.add(matrix[i][left]);
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }
}
//思路：用左上和右下的坐标定位出一次要旋转打印的数据，一次旋转打印结束后，往对角分别前进和后退一个单位。
