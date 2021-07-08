package src;


public class JZ44 {
    //找规律， 写公式：迭代+求余
    // 确定 n 所在数字的位数 ，记为 digit ；
    // 确定 n 所在的 数字 ，记为 num ；
    // 确定 n 是 num 中的哪一数位，并返回结果。
    // https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/solution/cong-zhao-gui-lu-dao-jie-ti-yi-bu-bu-tui-rueu/
    int findNthDigit(int n) {
        int digit = 1; // 记录位数，初始为一位数
        long start = 1; // 记录某一位数起始的第一个数，初始为一位数起点1
        long count = digit * start * 9; // 记录某一位数所有包含的数字个数，初始为一位数个数9
        /*
        *  1、判断第n位数字所属的数是几位数
        *  当n > count表明第n为数字所属的数比当前位数更高
        */
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        /*
        *  2、判断第n位数字属于哪一个数
        *  注意：第一步结束之后n已经改变了，是减去前几个不属于的位数的count之后的值
        *  (n - 1) / digit计算的是第n位数字属于当前位数里面的第几个数
        *  start是当前位数的第0个数，所以要n-1
        *  算出来之后再加上start就是第n位数字所属的数
        *  比如：
        *  n=5，start=1，digit=1
        *  number = 1 + (5-1)/1 = 5
        */
        long number = start + (n - 1) / digit;
        /*
        *  3、判断第n位数字在第二步找出的数中是第几位
        *  (n - 1) % digit计算的就是第几位（除去几个digit，余数就是所在的位数）
        *  比如：
        *  n=20，
        *  第一步后：n=11, satrt=10, digit=2
        *  第二步后：number= 15
        *  第三步：(n-1)%digit = 0说明是15这个数的第一位
        *  与字符串‘0’相减返回成数字即可
        */
        String sNumber = String.valueOf(number);
        return sNumber.charAt((n - 1) % digit) - '0';
    }


}
