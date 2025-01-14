package collectionsQueueAndSet;

import java.awt.*;
import java.util.*;

class Student{
    int rollNumber;
    String name;


    public Student(int rollNumber,String name)
    {
        this.rollNumber=rollNumber;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    /*    public void setRollNumber(int rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    public  void setName(String Name)
    {
        this.name=name;
    }

    public int getRollNumber()
    {
        return this.rollNumber;
    }
    public String getName()
    {
        return this.name;
    }*/
}
public class LearnSets {
    enum color{
        RED,YELLOW,PINK;
    }
    public static void main(String[] args) {
        System.out.println(color.RED);
        EnumSet<color> enumSet=EnumSet.allOf(color.class);
        //Set<Integer> set=new HashSet<>(); O(1)
        //Set<Integer> set=new LinkedHashSet<>();  O(n)
       /* Set<Integer> set=new TreeSet<>(); // O(log n)
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(50);
        set.remove(10);
        System.out.println(set.contains(20));
        System.out.println(set);*/
/*        Set<String> set=new HashSet<>();
        set.add("Ram");
        set.add("Ram");
        set.add("Anuj");
        set.add("Rakesh");
        System.out.println(set);*/
        Set<Student> set=new HashSet<>();
        Student s1=new Student(1,"Kumar");
        Student s2=new Student(1,"Rohit");
        System.out.println(s1.equals(s2));
        set.add(s1);
        set.add(s2);
        set.add(new Student(2,"Gaurav"));
        set.add(new Student(1,"Gaurav"));
        System.out.println(set);

    }
}
