package com.dsy.pattern.arithmetic.linkedList.addTwoNumber;

/**
 * 链表相加-第一种方式
 */
public class AddTwoNumbers1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
