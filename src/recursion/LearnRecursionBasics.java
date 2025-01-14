package recursion;

public class LearnRecursionBasics {
    public static void main(String[] args) {
         //bar(3);
        //System.out.println(sumOfN(5));
        System.out.println(fibOfN(8));
    }
    static int fibOfN(int n)
    {
        if(n<=1)return n;
        return fibOfN(n-1)+fibOfN(n-2);
    }



    static int sumOfN(int n)
    {
        if (n == 1)return 1;
        return sumOfN(n-1)+n;
    }
    static void fun(int n)
    {
        if(n>0) {
            System.out.println("Hello world!!:"+n);
            fun(n - 1);
        }
    }static void foo(int n)
    {
        if(n>0) {
            foo(n - 1);
            System.out.println("Hello world!!:"+n);

        }
    }
    static  void bar(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }
}
