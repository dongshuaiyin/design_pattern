package com.dsy.pattern.arithmetic.sort;

/**
 * 快速排序
 */

public class QuickSort {

    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = (int)(Math.random() * 100);
//            System.out.print(array[i] + " ");
//        }
        int[] array = {3, 9, 6, 2, 4, 7};
        quickSort(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] nums) {
        quickSortImpl(nums, 0, nums.length - 1);
    }

    private static void quickSortImpl(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int povit = array[start];
        while (left <= right) {

            //一下两个步骤的意思为： 将数组中大的值和小得值 两极分化

            //查询右边的值是否比右边的值小
            while (left <= right && array[left] < povit) {
                left ++;
            }
            //查找右边值是否比需要比较的值大
            while (left <= right && array[right] > povit) {
                right --;
            }

            //找到对应位置的值进行位置替换
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left ++;
                right--;
            }
        }
        //二分并递归运算
        quickSortImpl(array, start, right);
        quickSortImpl(array, left, end);
    }
}
