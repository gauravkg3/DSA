package opps4;

public class LearnAbstract {
    public static void main(String[] args) {
        //Vehicle vehicle=new Vehicle();
    }
}
abstract class Vehicle{
    abstract void acclerate();
    abstract int brake(int wheels);
}
class car extends Vehicle{

    @Override
    void acclerate() {

    }

    @Override
    int brake(int wheels) {
    return wheels;
    }
}