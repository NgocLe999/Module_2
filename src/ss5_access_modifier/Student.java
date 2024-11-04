package ss5_access_modifier;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    public static String school;

    public Student() {
    }

    public Student(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public int getId() {
//        ghi log ai la nguoi truy cap
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
//private package/default
     protected void study() {
    }

    public static void changeNameSchool(String temp) {
        school = temp;
    }

    public static void main(String[] args) {
        Student s = new Student(1, "HaiTT", "CodeGym");
        Student s2 = new Student(2, "HaiTT2", "CodeGym");

        Student.school = "CodeGym Việt Nam";

        System.out.println(s.id);
        System.out.println(s2.school);

    }

}
