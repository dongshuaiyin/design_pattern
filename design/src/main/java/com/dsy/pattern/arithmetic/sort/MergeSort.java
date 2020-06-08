package com.dsy.pattern.arithmetic.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int[] temp = new int[array.length];
        mergeSort(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergeSort(int[] nums) {
        if (null == nums || nums.length < 1) {
            return;
        }
        int[] temp = new int[nums.length];

        mergeSortImpl(nums, 0, nums.length - 1, temp);
    }

    private static void mergeSortImpl(int[] nums, int start, int end, int[] temp) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start)/2;
        //先分割数组  直到分割为最小单元
        mergeSortImpl(nums, start, mid, temp);
        mergeSortImpl(nums, mid + 1, end, temp);
        //比较两者的值
        merge(nums, start, mid, end, temp);
    }

    private static void merge(int[] nums, int start, int mid, int end, int[] temp) {
        int left = start;
        int right = mid + 1;
        int index = start;
        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = nums[left++];
        }
        while (right <= end) {
            temp[index++] = nums[right++];
        }
        //最后一个元素不要忘了比较
        for (index = start; index <= end; index++) {
            nums[index] = temp[index];
        }
    }

}
