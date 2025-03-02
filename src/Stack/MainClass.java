package Stack;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {
        //StackUsingArray stack=new StackUsingArray(4);
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
       // stack.printStack();

        stack.push(5);
//
//        stack.printStack();
//        System.out.println(stack.peek());
//
//        stack.printStack();
//        System.out.println(stack.pop());
//        stack.printStack();
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" =>");
        }
        System.out.println(stack.peek());

        ArrayDeque<Integer> stackAD=new ArrayDeque<>();
        stackAD.push(4);
        stackAD.push(2);
        System.out.println(stackAD.pop());
    }
}
