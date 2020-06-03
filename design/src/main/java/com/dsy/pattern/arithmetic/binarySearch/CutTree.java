package com.dsy.pattern.arithmetic.binarySearch;

public class CutTree {

    public static void main(String[] args) {
        int[] L = {232, 124, 456};
        int k = 7;
        System.out.println(cutTree(L, k));
    }

    public static int cutTree(int[] L, int k) {
        if (null == L || L.length < 1) {
            return 0;
        }
        if (k <= 0) {
            return 0;
        }
        int left = 1;
        int right = 0;
        for (int l : L) {
            right = Math.max(right, l);
        }
        while (left + 1 < right) {
            //为了防止超出最大值
            int mid = left + (right - left) / 2;
            if (count(L, mid) < k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (count(L, right) >= k) {
            return right;
        }
        if (count(L, left) >= k) {
            return left;
        }

        return 0;
    }

    /**
     * 计算总共能分多少次
     * @param L
     * @param length
     * @return
     */
    public static int count(int[] L, int length) {
        int pecees = 0;
        for (int l : L) {
            pecees += l/length;
        }
        return pecees;
    }
}
