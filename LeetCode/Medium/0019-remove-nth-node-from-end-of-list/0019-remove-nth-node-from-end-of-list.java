class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode l1=head,l2=head;
        int i=0;
        while(i<n){
            l1=l1.next;
            i++;
        }
        if(l1==null) return head.next;
        while(l1.next!=null)
        {
            l1=l1.next;
            l2=l2.next;
        }
        l2.next=l2.next.next;
        return head;
    }
}