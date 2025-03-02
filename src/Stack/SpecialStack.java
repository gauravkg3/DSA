package Stack;

import java.util.ArrayDeque;

public class SpecialStack {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(30);

        System.out.println("Current Min: " + stack.getMin()); // Should print 5
        System.out.println("Popped: " + stack.pop()); // Should print 30
        System.out.println("Current Min: " + stack.getMin()); // Should print 5
        System.out.println("Popped1: " + stack.pop()); // Should print 5 (encoded value)
        System.out.println("Current Min: " + stack.getMin()); // Should print 10
        System.out.println("Popped: " + stack.pop()); // Should print 20
        System.out.println("Popped: " + stack.pop()); // Should print 10
        System.out.println("Popped: " + stack.pop()); // Should print -1 (stack is empty)
    }

    ArrayDeque<Integer> stack;
    int min;

    public SpecialStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
        }
        if (x < min) {
            stack.push(2 * x - min);
            min = x;
        } else {
            stack.push(x);
        }
    }
    public int pop()
    {
        if(stack.isEmpty()) return -1;
        int y=stack.pop();
        if(y<min)
        {
            int nextMin=2*min-y;
            int temp=min;
            min=nextMin;
            return  min;
        }
        return y;
    }
    public int getMin(){
        if(stack.isEmpty()) return -1;
        return min;
    }
}
