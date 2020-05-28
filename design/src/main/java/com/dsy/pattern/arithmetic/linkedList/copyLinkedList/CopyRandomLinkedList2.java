package com.dsy.pattern.arithmetic.linkedList.copyLinkedList;


/**
 * 不用hashMap  实现随机指针
 */
public class CopyRandomLinkedList2 {

    public static void main(String[] args) {


    }

    public Node copyRandomList(Node head) {
        if (null == head) {
            return head;
        }
        copyNode(head);
        copyRandom(head);

        return split(head);
    }

    public void copyNode(Node head) {
        while (null != head) {
            Node node = new Node(head.val);
            Node next = head.next;
            head.next = node;
            node.next = next;
            head = next;
        }
    }

    public void copyRandom(Node head) {
        while (null != head) {
            Node random = head.random;
            if (null != random) {
                head.next.random = random.next;
            }
            head = head.next.next;
        }
    }

    public Node split(Node head) {
        Node node = head.next;
        while (null != head) {
            Node next = head.next;
            head.next = next.next;
            head = next.next;
            if (null != next.next) {
                next.next = next.next.next;
            }
        }
        return node;
    }

}
