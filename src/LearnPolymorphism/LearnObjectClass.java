package LearnPolymorphism;

import java.util.Objects;

class Car {
    String model;
    int year;
   public Car(String model,int year)
   {
       this.model=model;
       this.year=year;

   }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);

    }
    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    //   public String toString(){
//       return "Car ka model "+model+" and the year of model is "+year;
//   }
//    public boolean equals(Object obj)
//    {
//        Car that=(Car)obj;
//        if (this.model.equals(model) && this.year==that.year)
//        {
//            return true;
//        }
//        return false;
//    }

//
//    @Override
//    public int hashCode()
//    {
//        int intitalNumber=31;
//        intitalNumber+=year;
//        intitalNumber+=model.hashCode();
//        return intitalNumber;
//
//    }

 }

public class LearnObjectClass{
    public static void main(String args[])
    {
        Car car1=new Car("Toyta",2021);
        Car car2=new Car("Toyta",2023);
       // System.out.println(car1==car2);
        System.out.println(car1.equals(car2));
       System.out.println(car1);
//        System.out.println(car2);
   //     System.out.println(car1.hashCode());
    //    System.out.println(car2.hashCode());
    }
}
