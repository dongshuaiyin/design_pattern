package com.dsy.pattern.arithmetic.binarySearch;

/**
 * 稍微提升一点的二分查找你算法
 */
public class BinarySearch {

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,1,2,3};
        int target = 8;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //第一步先找到取值空间 取值空间去的上半部分  或者是下半部分
            if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        if (target == nums[start]) {
            return start;
        }
        if (target == nums[end]) {
            return end;
        }
        return -1;
    }
}
