package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.ListNode;

/**
 * Given a singly linked list L: L 0→L 1→…→L n-1→L n,
 * reorder it to: L 0→L n →L 1→L n-1→L 2→L n-2→…
 * <p>
 * You must do this in-place without altering the nodes' values.
 * <p>
 * For example,
 * Given{1,2,3,4}, reorder it to{1,4,2,3}.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        head = doReorder(head);
    }
    // TODO:
    private ListNode doReorder(ListNode head){
        if ( head.next == null)
            return head;
        return head;
    }
}