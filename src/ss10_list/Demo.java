package ss10_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
//        Generic
//        Wrapper class - autoboxing - chuyển nguyên thủy thành đối tượng
//        List<Integer> list = new LinkedList<>();
//        list.add(8);
//        list.add(3);
//        list.add(5);
//        list.add(4);
//        list.get(1);
//        list.remove(Integer.valueOf(3));
//        for (Integer i : list) {
//            System.out.println(i);
//        }
        Set<String> set = new HashSet<>();
        Set<Long> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add("Hai");
        set.add("Hoa");
        set.add("Huy");
        set.add("Huy");
        set.add("Nga");

        set.contains("123");
        for (String i : set) {
            System.out.println(i);
        }



    }
}
