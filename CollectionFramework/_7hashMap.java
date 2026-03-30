package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class person {
    private String name;
    private int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // hashCode() and equals() are defined to logical equality of objects.

    //hashCode() is used to generate an integer hash value for an object.
    //equals() is used to check whether two objects are logically equal(based no data), not whether they are the same object in memory.

    //If two objects are equal according to equals(), they must have the same hashCode().

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
//        return id + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        person other = (person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() { // it runs by default when we try to print anything.
        return "id : " + id + ", name : " + name;
    }
}

public class _7hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(11, "Ritu");
        map.put(20, "Neha");
        map.put(20, "Naveen"); // replaced to Naveen (Uniqueness of keys)
        map.put(13, "Shubham");
//        map.put(null, "Shiv");
//        map.put(null, "Shiva");
        System.out.println(map);
        System.out.println(map.get(20));
        System.out.println(map.get(2));
        System.out.println(map.containsKey(11)); // Time Complexity(Fast) : O(1)
        System.out.println(map.containsValue("Ritu"));
        Set<Integer> integers = map.keySet(); // do not contains duplicate elements
        for (int i : integers){
            System.out.println(map.get(i)); // No order maintains in hashmaps
        }



        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String > e : entries){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        for (Map.Entry<Integer, String > e : entries){
            e.setValue(e.getValue().toUpperCase());
        }
        System.out.println(entries);


//        String res = map.remove(13);
//        System.out.println("removed : " + res);
//        System.out.println(map);

        boolean res = map.remove(13, "sahil");
        System.out.println("removed : " + res);
        System.out.println(map);



//In the case of class object Type HashMap
        HashMap<person, String> per = new HashMap<>();
        // All Objects have different hashcode
        person p1 = new person("Alice", 1); //
        person p2 = new person("Bob", 2);
        person p3 = new person("Alice", 1);

        //Here we need to tell to the compiler that p1 & p3 are same.
        per.put(p1, "Engineer"); // hashcode1 --> index1 --> Now equals()
        per.put(p2, "Designer"); // hashcode2 --> index2
        per.put(p3, "Manager"); // hashcode3 --> index3
        System.out.println(p1==p3);
        System.out.println(p1.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());


        System.out.println("HashMap Size : " + per.size());
        System.out.println("Value for p1 : " + per.get(p1));
        System.out.println("Value for p3 : " + per.get(p3));

        System.out.println(p1);









        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90); // hashcode1 --> index1
        map1.put("Neha", 92); // hashcode2 --> index2
        map1.put("Shubham", 99); // hashcode1 --> index1 --> equals() --> replace(if true)

    }
}
