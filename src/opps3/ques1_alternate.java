package opps3;

public class ques1_alternate {
    public static void main(String[] args) {
    int a[]={2,5,6,8,9,7};
    lastNumberInSortedPosition(a);
    for(int ele:a)
    {
        System.out.println(ele);
    }
    }
    static void lastNumberInSortedPosition(int arr[])
    {
        int n=arr.length;
        int last=arr[n-1];
        int swapIndex=n-2;
        while(swapIndex>=0 && arr[swapIndex]>last)
        {
            swapIndex--;
        }
        for (int i = n-1; i >=swapIndex+2 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[swapIndex+1]=last;
    }
}
