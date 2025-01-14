package timeComplexity;

public class BigONotations {
    public static void main(String[] args) {
    int arr[]={3,7,1,2,9};
    int key=3;
        //System.out.println(checkIfNumberIsPresent(arr,key));
        printALlPairsInAnArray(arr);
    }
    //O(1)
    static int getFirstNumber(int arr[])
    {
        return arr[0];
    }
    //O(n)
    static  boolean checkIfNumberIsPresent(int arr[],int key)
    {
       for(int element :arr)
       {
           if(element==key)
               return true;
       }
        return false;
    }
    static void printALlPairsInAnArray(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                System.out.println(a[i]+" "+a[j]);
                }

        }
    }
}
