package collectionsQueueAndSet;

import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {
    Queue<Integer> priorityQueue=new java.util.PriorityQueue<>((a,b)->b-a);

    //for integer with lesser value has higher priority
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());

    }
}
