package backtrackingLive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String s="abbaca";
        List<List<String>> ans=palindromicPartitioning(s);
        for(List<String> ele:ans)
        {
            for(String ss:ele) {
                System.out.print(ss + " ");
            }
            System.out.println();

        }
    }
    static  List<List<String>> palindromicPartitioning(String s)
    {
        List<List<String>> ans=new ArrayList<>();
        palindromicPartitioningHelper(s,0,ans,new ArrayList<>());
        return ans;
    }
    static void palindromicPartitioningHelper(String s,int index,List<List<String>> ans,List<String> curr)
    {
        if(index==s.length())
        {
            List<String> copyCur=new ArrayList<>(curr);
            ans.add(copyCur);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if(isPalindrome(s,index,i))
            {
                curr.add(s.substring(index,i+1));
                palindromicPartitioningHelper(s,i+1,ans,curr);
                curr.remove(curr.size()-1);
            }
            
        }

    }
    static boolean isPalindrome(String s,int l,int r)
    {
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
