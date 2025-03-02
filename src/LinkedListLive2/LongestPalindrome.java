package LinkedListLive2;

public class LongestPalindrome {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(1);
        Node n4=new Node(2);
        Node n5=new Node(1);

        head.next=n1;
        n1.next =n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(longestPalindrome(head));
    }
    static int longestPalindrome(Node head)
    {
        Node curr=head;
        Node prev=null;
        int ans=0;
        if(head==null) return 0;
        if(head.next==null) return 1;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            int ifCurrIsAtCenter=common(next,prev);
            int sizeIfAtCenter=2*ifCurrIsAtCenter+1;

            int ifCurrIsNotAtCenter=common(curr,next);
            int sizeIfNotAtCenter=2*ifCurrIsNotAtCenter;

            int maxOfBoth=Math.max(sizeIfAtCenter,sizeIfNotAtCenter);
            ans=Math.max(maxOfBoth,ans);
            prev=curr;
            curr=next;
        }
        return ans;
    }

    static int common(Node a,Node b)
    {
        int count=0;
        while(a!=null && b!=null)
        {
            if(a.val==b.val)
            {
                count ++;
                a=a.next;
                b=b.next;
            }
            else break;
        }
        return count;
    }
}
