package LinkedList;

public class ReverseKTimes {
    public static void main(String[] args) {

        Nodes head=new Nodes(1);
        Nodes n1=new Nodes(2);
        Nodes n2=new Nodes(3);
        Nodes n3=new Nodes(4);
        Nodes n4=new Nodes(5);
         head.next=n1;
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;

         int k=2;
         printLinkedList(head);
         Nodes reverseKGroups=reverseKGroup(head,k);
         printLinkedList( reverseKGroups);



    }

    static Nodes reverseKGroup(Nodes head,int k)
    {
        Nodes dummy=new Nodes(-1);
        dummy.next=head;

        Nodes prevTail=dummy;
        Nodes currHead=head;

        while(currHead!=null)
        {
            Nodes currTail=findTailAfterK(currHead,k);
            if(currTail==null) break;

            Nodes nextHead=currTail.next;
            reverseKtimes(currHead,k);
            prevTail.next=currTail;

            prevTail=currHead;
            currHead=nextHead;
        }
        prevTail.next=currHead;
        return dummy.next;
    }
    static  Nodes reverseKtimes(Nodes head,int k)
    {
        if(head==null || head.next==null) return head;

//        Nodes prev=head;
//        Nodes curr=head.next;
//        head.next=null;
        Nodes curr=head;
        Nodes prev=null;
        int count=0;


        while(count<k && curr!=null)
        {
            Nodes next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        return prev;

    }
    static void printLinkedList(Nodes head)
    {
        Nodes temp=head;

        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    static Nodes findTailAfterK(Nodes head,int k)
    {
        for (int i = 0; i < k-1; i++) {
            head=head.next;
            if(head==null) return null;
        }
        return head;
    }
}
class Nodes {
    int val;
    Nodes next;

    public Nodes(int val)
    {
        this.val=val;
        this.next=null;
    }
}
