package Queue;

public class Main {
    public static void main(String[] args) {
        // MyQueue queue=new MyQueue(4);
        // QueueUsingTwoStacks queue=new QueueUsingTwoStacks();
       // QueueUsingOneStack queue=new QueueUsingOneStack();
        StackUsingOneQueue stack=new StackUsingOneQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(99);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    /*queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
        // queue.printQueue();
        //  System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        //  queue.printQueue();
        // System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(400);
        queue.enqueue(490);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
*/


    }
}
