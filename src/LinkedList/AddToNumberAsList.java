package LinkedList;

public class AddToNumberAsList {
    public static void main(String[] args) {
        Nodes l1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(3);
        Nodes n4 = new Nodes(4);
        Nodes n5 = new Nodes(5);
        Nodes n6 = new Nodes(6);
        l1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;


//        Node l2 = new Node(8);
//        Node n4 = new Node(8);
//        l2.next = n4;
        printLinkedList(l1);
      //  printLinkedList(l2);
//        Node sum = addTwoLL(l1, l2);
//        printLinkedList(sum);

        Nodes reorder=reorderLL(l1);
        printLinkedList(reorder);

//        Node output=addTwoLL(l1,l2);
//        printLinkedList(output);
    }
    static Nodes reorderLL(Nodes head)
    {
        Nodes slow=head;
        Nodes fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Nodes l2=reverseLinkedList(slow);
        Nodes l1=head;

        while(true){
            if(l1==l2)
            {
                l1.next=null;
                break;
            }

            Nodes l1Next=l1.next;
            Nodes l2Next=l2.next;

            l1.next=l2;
            l2.next=l1Next;

            l1=l1Next;
            l2=l2Next;
        }
        return  head;
    }

    static Nodes addTwoLL(Nodes l1, Nodes l2) {
        Nodes r1 = reverseLinkedList(l1);
        Nodes r2 = reverseLinkedList(l2);
        int carry = 0;
        Nodes ans = null;
        Nodes temp = null;

        while (r1 != null || r2 != null || carry != 0) {
            int sum = carry;
            if (r1 != null) {
                sum += r1.val;
                r1 = r1.next;
            }
            if (r2 != null) {
                sum += r2.val;
                r2 = r2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;

            Nodes newNode = new Nodes(digit);
            if (ans == null) {
                ans = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

        }
        return reverseLinkedList(ans);

    }

    static Nodes reverseLinkedList(Nodes head) {
        if (head == null || head.next == null) return head;

        Nodes prev = head;
        Nodes curr = head.next;
        head.next=null;
        while (curr != null) {
            Nodes next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printLinkedList(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int val;
    Nodes next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}