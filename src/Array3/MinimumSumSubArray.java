package Array3;

public class MinimumSumSubArray {
    public static void main(String[] args) {
        int a[]={1,2,5,6,7,2};
        int target=16;
        System.out.println(minimumSumSubArray(a,target));
    }
    public static  int minimumSumSubArray(int a[],int target)
    {
        int l=0,r=0;
        int x=-1,y=-1;
        int currSum=0;
        int minLength=Integer.MAX_VALUE;
        int n=a.length;

        while(r<n)
        {
            currSum+=a[r];
            while(currSum>=target)
            {
              //  minLength=Math.min(minLength,r-l+1);

                if(r-l+1<minLength)
                {
                    minLength=r-l+1;
                    x=l;
                    y=r;
                }
                currSum-=a[l];
                l++;
            }
            r++;
        }
        if(minLength==Integer.MAX_VALUE){
            minLength=0;
        }
        System.out.println(x+" "+y);
        return minLength;
    }
}
