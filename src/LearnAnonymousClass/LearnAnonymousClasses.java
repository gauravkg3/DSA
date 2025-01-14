package LearnAnonymousClass;

public class LearnAnonymousClasses {
//    class InnerClass extends outerClass{
//
//    }
    SuperInterface superInterface=new SuperInterface() {
    @Override
    public void interfaceMethod() {
        System.out.println("I am singing");
    }
};
    OuterClass outerClass=new OuterClass(){
        void sing(){

        }
        public void outerMethod(){

        }
    };

    public static void main(String[] args) {
        Walkable walkable=(int steps)->{
            System.out.println("Walked "+steps+" steps");
            return steps;
        };
        walkable.walk(5);
        Walkable obj2=(int steps)->2*steps;
        System.out.println(obj2.walk(5));
    }
}
interface SuperInterface{
    void interfaceMethod();
}
class OuterClass{
    public void outerMethod(){

    }
}
interface Walkable{
    int walk(int steps);
}
