package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class smallerOnLeftAndRight {
    public static void main(String[] args) {
        int a[]={10,20,30,50,10,70,30};
        int ans[]=smallerOnRight(a);
        //int ans[]=maxMinArray(a);
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static  int[] maxMinArray(int arr[])
    {
        int n=arr.length;
        int left[]=smallerOnLeft(arr);
        int right[]=smallerOnRight(arr);
        int ans[]=new int [n];
        Arrays.fill(ans,Integer.MIN_VALUE);
        for(int i = 0; i < n; i++) {
            int wl=right[i]-left[i]-1;
            ans[wl-1]=Math.max(ans[wl-1],arr[i]);
        }
        for (int i = n-2; i >=0 ; i--) {
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        return ans;
    }

    static int[] smallerOnLeft(int a[])
    {
        int n=a.length;
        int ans[]=new int[n];

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && a[stack.peek()]>a[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return  ans;
    }
    static int[] smallerOnRight(int a[])
    {
        int n=a.length;
        int ans[]=new int[n];

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && a[stack.peek()]>a[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i]=n;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return  ans;
    }
}
