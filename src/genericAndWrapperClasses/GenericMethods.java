package genericAndWrapperClasses;

public class GenericMethods {
    public static void main(String[] args) {
    printdata("opps3.Hello");
    printdata(125);
    GenericMethods obj=new GenericMethods();
    //obj.<String>doubleData("My name is Khan");
   // obj.doubleData("My name is Khan");
    obj.doubleData(132);
    CustomClass customClass=new CustomClass();
   // obj.doubleData(customClass);
    }
    static <E> void printdata(E data){
        System.out.println(data);

    }
    <E extends Number> void doubleData(E data)
    {
        System.out.println(data);
    }
}
class CustomClass{

}
