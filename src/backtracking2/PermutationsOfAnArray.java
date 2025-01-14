package backtracking2;

public class PermutationsOfAnArray {
    public static  void main(String args[])
    {
        int arr[]={1,2,3};
        permute(arr,0,arr.length-1);

    }
    static void permute(int a[],int l,int r)
    {
        if(l==r)
        {
            printOfArray(a);
            return;
        }
        for (int i = l; i <=r; i++) {
            swap(a, i, l);
            permute(a,l+1,r);
            swap(a, i, l); //backtracking
        }

    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static  void printOfArray(int a[])
    {
        for(int ele: a)
        {
            System.out.print(ele);
        }
        System.out.println();
    }
}
