package collectionsAndList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListIterator {
    public static void main(String[] args) {
        /*List<String> fruits=new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");
        System.out.println(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));

        }

        for (String fruit:fruits)
        {
            System.out.println(fruit+"*");
        }
        Iterator<String> fruitsIterator=fruits.iterator();
        while(fruitsIterator.hasNext())
        {
            System.out.println("Iterator:"+fruitsIterator.next());
        }
        Iterator<String> fruitsListIterator=fruits.listIterator();
        while(fruitsListIterator.hasNext())
        {
            System.out.println("ListIterator:"+fruitsListIterator.next());
        }
        List<String> smallList=fruits.subList(1,2);
        System.out.println(smallList);*/

        Stack<String> fruits=new Stack<>();
        fruits.push("A");
        fruits.push("B");
        fruits.push("C");
        fruits.push("D");
        fruits.push("E");
        System.out.println(fruits.pop());
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits);
        System.out.println(fruits.empty());
    }
}
