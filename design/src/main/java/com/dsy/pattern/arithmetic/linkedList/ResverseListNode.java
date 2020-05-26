package com.dsy.pattern.arithmetic.linkedList;

/**
 * 链表反转--节点反转
 */
public class ResverseListNode {

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
        ListNode node0 = resverse(head);
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
    public static ListNode resverse(ListNode head) {

        if (null == head) {
            return head;
        }

        ListNode prev = head;
        ListNode current = head.next;
        head.next = null;

        while (null != current) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        return prev;
    }
}
