package com.dsy.pattern.arithmetic.sort;

/**
 *  插入排序
 */

public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        insertSort(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertSort(int[] array) {
        //这里是要插入的节点
        int insertNode;
        //这里是记录最小或最大值的索引
        int j;
        for (int i = 1; i < array.length; i++) {
            //这是要插入的节点
            insertNode = array[i];
            j = i - 1;
            //往后移位 -》 指比插入节点值的数向后移位
            while (j >= 0 && insertNode < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j + 1] = insertNode;
        }
    }
}
