package recursionProblems;

import java.sql.SQLOutput;

public class fastPower {
    public static  void main(String args[]) {
        //System.out.println(power(2.0, 3.0));
        System.out.println(fastPower(7.0, 7,30));

    }
    static double power(double a,double b)
        {
            if (b == 0) return 1;

          return   a*power(a, b - 1);
        }
        static double fastPower(double a,int b,int m)
        {
            if(b<0) return fastPower(1/a,Math.abs(b),m);
            if(b==0)return 1;
            else if(b%2==0)
            {
                return fastPower((a%m*a%m)%m,b/2,m);
            }
            else return (a%m * fastPower(a,b-1,m)%m)%m;
        }

}
