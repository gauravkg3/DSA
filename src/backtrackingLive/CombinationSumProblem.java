package backtrackingLive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombinationSumProblem {
    public static void main(String[] args) {
        int a[]={8,1,3,7,2,1,5};
        int target=12;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        Arrays.sort(a);
       ans= combinationSum(a,target);
        for (ArrayList<Integer> al:ans)
        {
            System.out.println(al);
        }

    }
    static ArrayList<ArrayList<Integer>> combinationSum(int [] a,int target)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        combinationSumHelper(a,target,ans,new ArrayList<>(),0);
        return ans;
    }
    static void combinationSumHelper(int a[],int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,int index)
    {
        ArrayList<Integer> currCopy=new ArrayList<>(curr);

        if(target==0)
        {
            ans.add(currCopy);
            return;
        }
        for (int i = index; i < a.length ; i++) {
            if(a[i]>target) return;
            if(i>index && a[i]==a[i-1]) continue;

            //target-=a[i];
        curr.add(a[i]);
        combinationSumHelper(a,target-a[i],ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
