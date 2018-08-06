package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.ListNode;

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
}

