package backtrackingLive;

import java.util.ArrayList;

public class SubsequenceProblems {
    public static void main(String[] args) {
        int  a[]={4,4,4,6};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans=subSequence(a);
        for (ArrayList<Integer> al:ans)
        {
            System.out.println(al);
        }

    }
    static ArrayList<ArrayList<Integer>> subSequence(int a[])
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        helperSubSequence(a,ans,new ArrayList<>(),0);
        return ans;
    }
    static  void helperSubSequence(int a[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,int index)
    {
        ArrayList<Integer> currCopy=new ArrayList<>(curr);
        ans.add(currCopy);

        for (int i = index; i < a.length; i++) {
            if(i>index && a[i]==a[i-1]) continue;
            curr.add(a[i]);
            helperSubSequence(a,ans,curr,i+1);
            curr.remove(curr.size()-1); //backtracking

        }
    }
}
