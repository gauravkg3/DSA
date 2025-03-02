package Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    public static void main(String[] args) {
    int a[]={4,2,2,2,2,-1,1,1,1,-3,0,1,2,3,3,3};
    int sum=5;
        Arrays.sort(a);
        List<List<Integer>> triplet=new ArrayList<>();
        for (int i = 0; i < a.length-2; i++) {
            if(i>0 && a[i]==a[i-1]) continue;
            List<List<Integer>> temp=twoSum(a,-a[i],i+1);
            for(List<Integer> list:temp)
            {
                list.add(0,a[i]);
                triplet.add(list);
            }
        }
        //List<List<Integer>> ans=twoSum(a,sum,0);
        //System.out.println(ans);
        System.out.println(triplet);

    }
    static List<List<Integer>> twoSum(int a[],int sum,int startFrom)
    {
        int l=startFrom;
        int r=a.length-1;
        List<List<Integer>> ans=new ArrayList<>();
        while(l<r)
        {
            if(l>startFrom && a[l]==a[l-1])
            {
                l++;
                continue;
            }
            if(r<a.length-1 && a[r]==a[r+1] ){
                r--;
                continue;
            }
            if(a[l]+a[r]>sum)
            {
                r--;
            } else if (a[l]+a[r]<sum) {
                l++;
            }else{
                List<Integer> temp=new ArrayList<>();
                temp.add(a[l]);
                temp.add(a[r]);
                ans.add(temp);
                l++;
                r--;
            }
            }

        return  ans;
    }

}
//import java.util.*;
//
//public class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        //You can code here
//        Arrays.sort(nums);
//        List<List<Integer>> ans=new ArrayList<>();
//        for(int i=0;i<nums.length-2;i++)
//        {
//            if(i>0 && nums[i]==nums[i-1]) continue;
//            List<List<Integer>> temp=new ArrayList<>();
//            temp=threeSumHelper(nums,-nums[i],i+1);
//            for(List<Integer> list:temp)
//            {
//                list.add(0,nums[i]);
//                ans.add(list);
//            }
//        }
//
//        return ans;
//
//    }
//    public List<List<Integer>> threeSumHelper(int [] nums,int target,int startsFrom)
//    {
//        int l=startsFrom;
//        int r=nums.length-1;
//        List<List<Integer>> ans=new ArrayList<>();
//        while(l<r)
//        {
//
//            // if(l>startsFrom && nums[l]==nums[l-1]){
//            //   l++;
//            //   continue;
//            // }
//            //   if(r<nums.length-1 && nums[r]==nums[r+1]){
//            //   l++;
//            //   continue;
//            // }
//            if(nums[l]+nums[r]>target)
//            {
//                r--;
//            }
//            else if(nums[l]+nums[r]<target)
//            {
//                l++;
//            }
//            else{
//                List<Integer> temp=new ArrayList<>();
//                temp.add(nums[l]);
//                temp.add(nums[r]);
//
//                //while (l < r && nums[l] == nums[l + 1]) l++; while (l < r && nums[r] == nums[r - 1]) r--;
//
//                ans.add(temp);
//                l++;
//                r--;
//
//            }
//        }
//        return ans;
//    }
//}