package opps3;

public class sortingAlgorithm {
    public static void main(String[] args) {
        int arr[]={5,9,3,1,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        for(int ele:arr)
        {
            System.out.print(ele+ " ");
        }
    }

    static void selectionSort(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=i; //assume i is the minimum index
            for (int j = i+1; j <n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }
        }

        static void insertionSort(int arr[]){
        int n=arr.length;
            for(int i = 1; i <n ; i++) {
                int last=arr[i];
                int swapIndex=i-1;
                while(swapIndex>=0 && arr[swapIndex]>last){
                    swapIndex--;
                }
                int j=i;
                while(j>swapIndex+1)
                {
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[swapIndex+1]=last;
            }
        }
    static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++)
        {
            boolean didISwap=false;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didISwap=true;
                }
            }
            if(!didISwap)break;
        }
    }
}
