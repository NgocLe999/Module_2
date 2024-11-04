package ss13_map;

import ss8_clean_code.entity.Student;
import ss8_clean_code.utils.compare.StudentCompareByPoint;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoMap {

    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("Huy", 3);
//        map.put("Hoa", 2);
//        map.put("Nga", 1);
//        map.put("Hai", 1);
//        if(!map.containsKey("Hai")) {
//            map.put("Hai", 1);
//        }else {
//            map.put("Hai", map.get("Hai") + 1);
//        }
//        Set<String> set = map.keySet();
//        for (String s: set) {
//            System.out.println(s + " " + map.get(s));
//        }
//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        for (Map.Entry<String, Integer> entry: set) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


        Map<Student, Integer> studentMap = new TreeMap<>(new StudentCompareByPoint());
        studentMap.put(new Student(2, "HaiTT", "QN", 9, "C0824M1"), 1);
        studentMap.put(new Student(3, "HaiTT1", "QN", 8, "C0824M1"), 1);
        studentMap.put(new Student(1, "HaiTT2", "QN", 10, "C0824M1"), 1);
//       studentMap.put(null, 1);
        Set<Student> set = studentMap.keySet();
        for (Student s : set) {
            System.out.println(s + " " + studentMap.get(s));
        }

    }
}
