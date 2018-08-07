package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.ListNode;

import java.util.List;


/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * For example:
 * Given1->2->3->4->5->NULLand k =2,
 * return4->5->1->2->3->NULL.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null)
            return head;
        int length = 1;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }
        n %= length;
        if (n == 0)
            return head;
        currentNode.next = head;

        for (int i = 0; i < length - n; i++) {
            currentNode = currentNode.next;
        }

        head = currentNode.next;
        currentNode.next = null;
        return head;
    }

    public void displayNodeList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = null;
        c.next = d;
        d.next = e;
        e.next = null;

        RotateList r = new RotateList();

        ListNode f = r.rotateRight(a, 5);
        r.displayNodeList(f);
    }
}
