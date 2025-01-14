package LearnPolymorphism;
class Data{
    int data;
}

public class LearnAboutMemory {
    public static void main(String[] args) {
    Integer a=5;
    Data obj=new Data();
    obj.data=5;
    changeValue(a,obj);
        System.out.println(a);
        System.out.println(obj);
        System.out.println(obj.data);
    }
    static void changeValue(int a,Data obj){
        a=10;
        obj.data=100;
    }
}
