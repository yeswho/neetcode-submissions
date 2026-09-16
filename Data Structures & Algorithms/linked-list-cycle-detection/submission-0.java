/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode currNode = head;

        while(currNode != null){
            if(!set.contains(currNode)){
                set.add(currNode);
            }else{
                return true;
            }

            currNode = currNode.next;
        }
        return false;
    }
}
