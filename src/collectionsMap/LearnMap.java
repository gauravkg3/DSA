package collectionsMap;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Map<String,String> map=new HashMap<>(); //0(1)
        map.put("us","United States");
        map.put("in","India");
        map.putIfAbsent("in","India2");
        map.put("en","England");


        Set<Map.Entry<String,String>> entries=map.entrySet();


        for(Map.Entry<String,String> entry:entries)
        {
            System.out.println("Value of EntrySet:"+entry);
            System.out.println(entry.getKey()+"="+entry.getValue());
            System.out.println();
        }





       /* System.out.println(map);
        map.remove("in");
        System.out.println(map.containsKey("us"));
        System.out.println("ContainsValue:"+map.containsValue("England"));
        System.out.println(map);
        System.out.println(map.get("en"));
        System.out.println(map.getOrDefault("on","Others"));*/


        //Set<String> keys=map.keySet();
//        ArrayList<String> keys=new ArrayList<>(map.keySet());
//        ArrayList<String> values=new ArrayList<>(map.values());
//        Collection<String> values2=map.values();
//        System.out.println(keys);
//        System.out.println(values2);






    }
}
