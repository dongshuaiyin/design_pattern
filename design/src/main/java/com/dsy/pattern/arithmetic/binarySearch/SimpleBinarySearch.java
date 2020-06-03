package com.dsy.pattern.arithmetic.binarySearch;

/**
 *  简单的二分查找
 */
public class SimpleBinarySearch {

    public static void main(String[] args) {

        int start = 1;
        int end = 100000000;
        int target = 8999999;
        System.out.println(binarySearch(start, end, target));


    }

    public static boolean binarySearch(int start, int end, int target) {
        if (start == target || end == target) {
            return true;
        }
        //这里的意思 头结点不能比尾结点大
        while (start + 1 < end) {
            //这里这么写的目的主要是为了防止越界
            int mid = start + (end - start) / 2;
            if (target == mid) {
                return true;
            } else if (target > mid) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return false;
    }
}
