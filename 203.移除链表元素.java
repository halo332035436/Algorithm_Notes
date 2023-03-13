/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode l = new ListNode();
        l.next = head;
        ListNode p = l;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return l.next;
    }
}
// @lc code=end
