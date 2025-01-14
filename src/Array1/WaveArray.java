package Array1;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[]={9,2,3,1,4,5,7};
        for (int ele:a)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
        //waveArrayNotLexographic(a);
        waveArray(a);
        for (int ele:a)
        {
            System.out.print(ele+ " ");
        }

    }
    static void waveArray(int a[])
    {
        Arrays.sort(a); //O(nlog n)
        int n=a.length;
        for (int i = 1; i <n; i+=2) {
          swap(a,i,i-1);
        }
    }
    static  void waveArrayNotLexographic(int a[])  //O(n)-->Better
    {
    int n=a.length;
        for (int i = 1; i < n; i++) {
            if(a[i-1]>a[i])
            {
                swap(a,i,i-1);
            }
            if(i<n-1 && a[i]<a[i+1])
            {
                swap(a,i,i+1);
            }
        }
    }

    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
