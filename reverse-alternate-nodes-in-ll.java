class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd.next==null) return;
        
        Node h1=odd;
        Node h2=odd.next;
        Node t1=h1, t2=h2;
        
        while (true)
        {
            t1.next=t1.next.next;
            t1=t1.next;
            
            if(t2.next.next==null)
            {
                t1.next=null;  break;
            }
            t2.next=t1.next;
            t2=t2.next;
            
            if(t1.next.next==null)
            {
                t1.next=null; break;
            }
        }
        t2.next=null;
        t1.next=reverse(h2);
    }
    static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
