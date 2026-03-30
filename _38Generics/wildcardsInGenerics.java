package _38Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Note : ArrayList is subclass and List is super class.

public class wildcardsInGenerics {

    // <T> uses when we have to return something
    public static <T> T getItem(ArrayList<T> list){
        return list.get(3);
    }

    //Mainly uses when we don't know the Type
//<?> type can be used only when we have to read only
    public static void copy(ArrayList<?> src, ArrayList<?> dst){
        for (Object o : src){
//        dst.add(o);  <- error
        }
    }

    //Upper Bound
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for (Number n : list){ // only class like Integer, Float, Double, Long(Lower Class) can be inserted into this list.
//        sum +=n ; // <-Error : Number(large) can't be put into the double(small)
            sum += n.doubleValue();
        }
        return sum;
    }

    //Lower Bound
    public static void printNum(List<? super Integer> list){ // upper than Integer class
        for (Object o : list){ // Object is super bound (Upper Class)
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<String>();
//        list.add("hello"); //  <- error


        System.out.println(sum(Arrays.asList(2,4,5.4,4.3)));
        printNum(Arrays.asList(2,3,"hello"));
    }
}
