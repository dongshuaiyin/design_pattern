package com.dsy.pattern.arithmetic.sort;

public class Test {

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = (int)(Math.random() * 10000);
//            System.out.print(array[i] + " ");
        }
        long start1 = System.currentTimeMillis();
        InsertSort.insertSort(array);
        long end1 = System.currentTimeMillis();
        System.out.println("insert -> " + (end1 - start1));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            array[i] = (int)(Math.random() * 10000);
//            System.out.print(array[i] + " ");
        }
        long end2 = System.currentTimeMillis();
        QuickSort.quickSort(array);
        System.out.println("quick -> " + (end2 - start2));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
