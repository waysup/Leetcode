import java.util.List;

public class Swap_Nodes_in_Pairs {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {

            ListNode l = head;
            if (head!=null && head.next!=null){
                head = l.next;
                l.next = swapPairs(head.next);
                head.next = l;
            }
            return head;

        }
    }
}
