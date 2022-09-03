public class LinkedListCycle {

    /*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.
    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
    Return true if there is a cycle in the linked list. Otherwise, return false.
    Example 1:
        Input: head = [3,2,0,-4], pos = 1 -> (here -4 connects to 2)
        Output: true
        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     */


    // 1 ms, faster than 45.51% & 45.9 MB, less than 52.25%
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int x) {
        value = x;
        next = null;
    }
}