package genericAndWrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {

        //Integer obj=new Integer(12);//deprecated
        Integer obj2=Integer.valueOf(13);
        Integer obj3=Integer.valueOf("13");
//        System.out.println(obj3);
//        System.out.println(obj2);
        Integer obj4=15; //autoboxing
    int age=obj2;  //unboxing

     Boolean myBoolean=Boolean.valueOf("True");
        System.out.println(myBoolean);

    }
}
