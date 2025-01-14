package recursionProblems;

public class recursionProblem1 {
    public static void main(String[] args) {
       // System.out.println(nCr(5,4));
        System.out.println(josephus(3,2 ));
    }
    static int nCr(int n,int r)
    {
        if(n==r || r==0) return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
    static int josephus(int n,int k)
    {
        if (n == 1) {
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
}
