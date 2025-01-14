package learnException;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        try {
            int age = sc.nextInt();
            if (age > 100) {
                throw new MyException("Yeah bro!!!!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{
    public MyException(String e)
    {
        super(e);
    }

}
