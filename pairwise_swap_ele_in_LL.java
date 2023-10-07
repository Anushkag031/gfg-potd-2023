class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null||head.next==null) return head;
        
        Node prev=head;
        Node curr=head.next;
        
        head=curr;
        
        while(true)
        {
            Node next=curr.next;
            curr.next=prev;
            
            if(next==null||next.next==null)
            {
                prev.next=next;
                break;
            }
            else prev.next=next.next;
            
            prev=next;
            curr=next.next;
        }
        return head;
    }
}
