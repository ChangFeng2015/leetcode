package leetCode.algorithm;


/**
 * @author  by Dave on 2016/10/15.
 */
public class AddTwoNumbers
{
    private ListNode solutionOne(ListNode l1, ListNode l2)
    {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
