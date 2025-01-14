package Array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifference {
    public static void main(String[] args) {
    int a[]={12,9,8,2,11,4,5};
    List<List<Integer>> ans =minDifference(a);
    for(List<Integer> list:ans)
    {
        System.out.println(list);
    }
    }
    static List<List<Integer>> minDifference(int a[])
    {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        int minDiffer=Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
//            if(a[i]-a[i-1]<minDiffer)
//            {
//                minDiffer=a[i]-a[i-1];
//            }
            minDiffer=Math.min(minDiffer,a[i]-a[i-1]);
        }
        for (int i = 1; i < n; i++) {
            if(a[i]-a[i-1]==minDiffer)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }

        }
        return  ans;

    }
}
