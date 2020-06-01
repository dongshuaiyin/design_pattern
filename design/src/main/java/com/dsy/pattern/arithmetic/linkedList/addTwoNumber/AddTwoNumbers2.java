package com.dsy.pattern.arithmetic.linkedList.addTwoNumber;

/**
 * 链表相加-第一种方式  ---升级版
 */
public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //先反转链表
        reverse(l1);
        reverse(l1);
        return reverse(addTwoNumber(l1, l2));
    }

    private ListNode reverse(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        current.next = null;
        while (null != current) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    private ListNode addTwoNumber(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        //相加超过10记录
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (null != l1 && null != l2) {
            int count = l1.val + l2.val + carry;
            //取余
            int num = count%10;
            //除法
            carry = count/10;
            ListNode node = new ListNode(num);
            dummy.next = node;
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (null != l1) {
            int count = l1.val + carry;
            int num = count%10;
            carry = count / 10;
            ListNode node = new ListNode(num);
            dummy.next = node;
            dummy = dummy.next;
            l1 = l1.next;
        }

        while (null != l2) {
            int count = l2.val + carry;
            int num = count%10;
            carry = count / 10;
            ListNode node = new ListNode(num);
            dummy.next = node;
            dummy = dummy.next;
            l2 = l2.next;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            dummy.next = node;
            dummy = dummy.next;
        }

        return prev.next;
    }


}
