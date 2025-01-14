package collectionsQueueAndSet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LearnDeque {
    public static void main(String[] args) {
      Deque<Integer> stack = new ArrayDeque<>();
        /*dq.offer(10);
        dq.offerLast(   20);
        dq.offerFirst(30);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peekLast());
    }*/

        //Stack Method
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        //Queue Method
        ArrayDeque<Integer>  q=new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        q.poll();
    }
}
