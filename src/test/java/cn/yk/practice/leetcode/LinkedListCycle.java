package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.ListNode;

/**
 * Created by Saber on 2018/8/3.
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        LinkedListCycle l = new LinkedListCycle();
        System.out.println(l.hasCycle(e));
    }
}
