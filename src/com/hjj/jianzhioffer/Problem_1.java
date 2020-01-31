package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/14 - 11:22
 */

/**
 * problem describe:题目：二维数组查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成函数Find，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Problem_1 {
    public static void main(String[] args) {
        int [][] test={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};//初始化二维数组的三种方式 https://blog.csdn.net/Code_lr/article/details/78538937
        boolean result=new Problem_1().Find(16,test);
        System.out.println(result);
    }

    //方法1：顺序查找 O(n^2)
//    public boolean Find(int target, int [][] array) {
//        int rowNumber = array.length;
//        int colNumber = array[0].length;
//        for (int i=0;i<rowNumber;i++){
//            for (int j=0;j<colNumber;j++){
//                if (target==array[i][j])
//                    return true;
//            }
//        }
//        return false;
//    }

    //方法2：二分查找   O(nlogn)
    public boolean Find(int target, int [][] array){
        int rowNumber = array.length;
        int colNumber = array[0].length;
        for (int i=0;i<rowNumber;i++){
            int low=0,high=colNumber-1;
            while (low<=high){
                int middle=(low+high)/2;
                if (target==array[i][middle])
                    return true;
                if (target<array[i][middle])
                    high=middle-1;
                if (target>array[i][middle])
                    low=middle+1;
            }
        }
        return false;
    }
}
