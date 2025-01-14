package learnEncapsulation;

public class MainInEncapsulation {
    public static void printHello()
    {
        System.out.println("Say hello");
        MainInEncapsulation mIE=new MainInEncapsulation();
        mIE.sayHi();

    }
    public void sayHi()
    {
        System.out.println("Say Hi");
    }

    public static void main(String[] args) {
        printHello();

    }
}
