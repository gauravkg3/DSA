package opps3;

//place the last element in sorted position
public class ques1 {
    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,1};
        int temp=arr[arr.length-1];
        int temp1;

        for (int i = arr.length-1; i >=0; i--) {
            if(temp<arr[i]){
                temp1=arr[i];
                arr[i]=temp;
                arr[i+1]=temp1;
            }
        }
        for (int element:arr)
        {
            System.out.println(element);
        }
    }
}
