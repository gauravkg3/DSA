package collectionsComparableComparator;

import java.util.*;

class MyCustomDogComparator implements Comparator<Animal>
{

    @Override
    public int compare(Animal o1, Animal o2) {
       // return o1.weight-o2.weight;
        return Integer.compare(o1.weight,o2.weight);
    }
}

public class LearnComaprableAndComparator {
    public static void main(String[] args) {

        Animal a1 = new Animal(2, "Leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(3, "Maxo", 6);
        Animal a4 = new Animal(4, "Don", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        System.out.println(dogs);
        //Collections.sort(dogs);
       // Collections.sort(dogs,new MyCustomDogComparator());
//        Collections.sort(dogs, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
       // Collections.sort(dogs,(o1,o2)->o1.name.compareTo(o2.name));
       // Collections.sort(dogs,(o1,o2)->o1.weight-o2.weight);
        Collections.sort(dogs,Comparator.comparing(Animal::getAge).thenComparing(Animal::getWeight)); //needs to implements getter method
        System.out.println(dogs);

        int a[][]={{5,4,3},{4,2,7},{1,2,9}};
        Arrays.sort(a,(arr1,arr2)->arr1[0]-arr2[0]);
       for(int e[]:a)
       {
           for(int ele:e)
           {
               System.out.print(ele+" ");
           }
           System.out.println();
       }
    }
}
