package backtracking2;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        generateParenethese(0,0,n,"",0);
    }
    static void generateParenethese(int open ,int close,int n,String curr,int i)
    {
        if(i==2*n)
        {
            System.out.println(curr);
            return;
        }
        if(open<n)
        {
            curr=curr+"(";
            generateParenethese(open+1,close,n,curr,i+1);
            curr=curr.substring(0,curr.length()-1);
        }
        if (close<open)
        {
            curr=curr+")";
            generateParenethese(open,close+1,n,curr,i+1);
        }
    }

}
