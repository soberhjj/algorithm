package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/14 - 16:23
 */

/**
 * problem describe:题目：替换空格
 * 实现函数replaceSpace，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
//字符数组转换为字符串的两种方式：https://blog.csdn.net/qq_33530388/article/details/79036756

public class Problem_2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        System.out.println(new Problem_2().replaceSpace(str));
    }

    //思路：先找出字符串中的空格数量，再开辟新的数组存储原字符串中的非空格字符并替换掉空格字符。
    public String replaceSpace(StringBuffer str) {
        int spaceNum=0;
        String s=str.toString();
        char [] a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==' ')
                spaceNum++;
        }
        char [] b=new char[(s.length()-spaceNum)+(spaceNum*3)];
        int j=0;
        for (int i=0;i<s.length();i++){
            if (a[i]!=' ')
                b[j++]=a[i];
            else {
                b[j++]='%';
                b[j++]='2';
                b[j++]='0';
            }
        }
        return new String(b);
    }
}
