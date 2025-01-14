package recursionProblems;

public class RecursionLive {
    public static void main(String[] args) {
        //System.out.println(fastPower(7,7,48));
        System.out.println(matrixPaths(3,3));
    }
    static int matrixPaths(int n,int m)
    {
        if(n==1 || m==1) return 1;
        return matrixPaths(n-1,m)+matrixPaths(n,m-1);
    }


    static double fastPower(double a,int b,int m)
    {
        if(b==0) {
            return 1;
        }
        if(b<0)
        {
            return fastPower(1/a,Math.abs(b),m);
        }
        if(b%2==0)
        {
            return fastPower((a%m*a%m)%m,b/2,m);
        }
        else return (a%m*fastPower(a,b-1,m)%m)%m;
    }
    static double power(double a,double b)
    {
        if(b==0)return 1;
        else
            return a*power(a,b-1);
    }
}
