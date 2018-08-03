package cn.yk.practice.leetcode;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class LinkedListCycle {
    // 通过快慢指针遍历，若相遇，则有环，若快指针指向null，则结束。
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        while (head.next != null && head.next.next != null) {
            head = head.next;
            if (head == slow)
                return true;
            slow = slow.next;
            head = head.next;
        }
        return false;
    }


    // 以空间换时间
//    public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> hashSet = new HashSet<ListNode>();
//        while (head!=null){
//            if (hashSet.contains(head))
//                return true;
//            hashSet.add(head);
//            head = head.next;
//        }
//        return false;
//    }

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

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
