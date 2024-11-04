package ss6_inheritance;

public class Main {
    public static void main(String[] args) {
//        long a = 5;
//        double b = 5l;
//
//        double c = 5.5;
//        int d = (int)c;
//        System.out.println(d);
//        Nguyên lý D trong SOLID
        Person[] people = new Person[3];
        Person person = new Student();
        people[0] = person;
        people[1] = new Employee();
        if(people[0] instanceof Student) {
            System.out.println(((Student)people[0]).getPoint());
        }


    }
}
