package Queue;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class StackUsingOneQueue {
    Queue<Integer> q=new LinkedTransferQueue<>();

    public void push(int data)
    {
        q.offer(data);
    }
    public int pop()
    {
        if(q.isEmpty()) return  -1;
        int size=q.size();
        for (int i = 0; i < size-1; i++) {
            q.offer(q.poll());
        }
        return q.poll();
    }
}
