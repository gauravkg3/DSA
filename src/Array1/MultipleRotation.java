package Array1;

import java.util.List;

public class MultipleRotation {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int b[]={20,4};
        //      int originalArray[]=a.clone();

//        for (int i = 0; i < b.length; i++) {
//            a=originalArray.clone();
//            multipleRotation(a,b[i]);
//            printArray(a);
//        }
            int ans[][]= multipleRotation(a,b);
            for(int ele []:ans)
            {
                printArray(ele);
                System.out.println();
            }

    }
    static  int [][] multipleRotation(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        int ans[][]=new int [m][n];
        int temp[]=new int[2*n];
        for (int i = 0; i < n; i++) {
        temp[i]=a[i];
        temp[i+n]=a[i];
    }
        for (int i = 0; i < m; i++) {
            int offSet=(b[i])%n;
            for (int j = 0; j < n; j++) {
            ans[i][j]=temp[j+offSet];
            }

        }

    return ans;
    }
//    public static void multipleRotation(int a[],int k)
//    {
//
//        for (int i = 0; i < k; i++) {
//            int temp=a[0];
//            for (int j = 0; j < a.length-1; j++) {
//                a[j]=a[j+1];
//            }
//            a[a.length-1]=temp;
//        }
//    }
    static void printArray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
