package genericAndWrapperClasses;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d1=new Dog<String>("asdasd132");
        Dog<String> d2=new Dog<>("kumar132");
        Dog<Integer> d3=new Dog<>(12);
        System.out.println(d1.id);
        System.out.println(d2.id);
        System.out.println(d3.getId());
    }
}
class Dog<E>{
    E id;
    public Dog(E id)
    {
        this.id=id;
    }
    E getId()
    {

        return id;
    }
}