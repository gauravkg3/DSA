package opps4;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey m1=new Monkey();
        m1.eats();
        m1.sing();
        System.out.println(Monkey.Legs);
    }
}
interface Animal{
   //public static final  int Legs=4;
     int Legs=4;
    void eats();

}
interface Pets{
    void sing();
}
class Monkey implements Animal,Pets{

    @Override
    public void eats()
    {
        System.out.println("Moneky eats");
    }
    @Override
    public void sing(){
        System.out.println("Monkey can sing");
    }
}