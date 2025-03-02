package Queue;

public class MyQueue {
    int size;
    private int a[];
    int front,rear;
    public MyQueue(int size)
    {
        this.size=size;
        a=new int[size];
        front=rear=-1;
    }
    public boolean isEmpty()
    {
        return front==-1;
    }
    public boolean isFull()
    {
        return rear==size-1;
    }
    public boolean enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full,no element can be added");
            return  false;
        }
        if(isEmpty())
        {
            front=0;
        }
        rear++;
        a[rear]=data;
        return  true;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty,can't deque");
            return -1;
        }
        int temp=a[front];
        if(front==rear)
        {
            front=rear=-1;
            return  temp;
        }
        front++;
        return temp;
    }
    public int peek(){
        if(isEmpty())
        {
            System.out.println("Can't peek,Queue is Empty");
            return -1;
        }
        return a[front];
    }
    public void printQueue()
    {
        for (int i = front; i <=rear; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
