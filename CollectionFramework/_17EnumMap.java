package CollectionFramework;

// EnumMap directly implements the Map

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

enum Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

public class _17EnumMap {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        //array of size same as enum
        // Assign values as -> ["Walk", "Gym", _, _, _, _, _]
        // No Hashing
        // Ordinal/Index is used
        // Faster than HashMap
        // Memory Efficient

        map.put(Day.Tuesday, "Gym");
        map.put(Day.Monday, "Walk");
        System.out.println(Day.Tuesday.ordinal());
        System.out.println(map.get(Day.Tuesday));


        System.out.println(map);
    }
}
