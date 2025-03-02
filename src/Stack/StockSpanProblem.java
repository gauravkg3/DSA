package Stack;

import java.util.ArrayDeque;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] a ={100,80,60,70,60,75,85};

            int[] s =StockSpan(a);
            for(int ele:s)
            {
                System.out.print(ele+" ");
            }
    }
    static int[] StockSpan(int[] a)
    {
        int size=a.length;
        int s[]=new int[size];
        s[0]=1;

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i < size; i++) {
            while(!stack.isEmpty())
            {
                int top=stack.peek();
                if(a[top]>a[i]) {
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty())
            {
                s[i]=i+1;
            }
            else{
                s[i]=i-stack.peek();
            }
            stack.push(i);
        }
    return s;
    }
}
