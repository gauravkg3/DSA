package learnException;

public class MainClass {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            System.out.println(arr [5]);
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e)
        {
            System.out.println("Handling the exception");
        }
    }
}
