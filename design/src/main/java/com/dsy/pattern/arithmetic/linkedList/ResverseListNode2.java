package com.dsy.pattern.arithmetic.linkedList;

import java.util.List;

/**
 * 链表反转--节点反转
 */
public class ResverseListNode2 {

    public static void main(String[] arg) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode tail = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = tail;
        ListNode node = head;
        while (null != node) {
            System.out.print(node.value);
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("  ");
        ListNode node0 = resverse(head, 1, 4);
        while (null != node0) {
            System.out.print(node0.value);
            node0 = node0.next;
            if (node0 != null) {
                System.out.print(" -> ");
            }
        }
    }

    /**
     *  链表反转
     * @param head
     * @return
     */
    public static ListNode resverse(ListNode head, int m, int n) {

        if (null == head || m >= n) {
            return head;
        }
        ListNode dumm = new ListNode(-1);
        dumm.next = head;
        head = dumm;
        //第一步：首先找到起始点
        for (int i= 1; i < m; i++) {
            head = head.next;
        }
        ListNode mPrevNode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postN = nNode.next;

        for (int i = m + 1; i <= n; i++) {
            ListNode next = postN.next;
            postN.next = nNode;
            nNode = postN;
            postN = next;
        }

//        ListNode nNode = prev;
//        dumm.next.next = nNode;
        mNode.next = postN;
        mPrevNode.next = nNode;
        return dumm.next;
    }
}
