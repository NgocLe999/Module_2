package ss6_inheritance;

public class Student extends Person implements IPerson,IAnimal{
    private double point;
    private String className;

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("Đi học");
    }

    public Student(int id, String name, String address, double point, String className) {
        super(id, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    

    public static void main(String[] args) {
        String a = "123";
        String b = "123";
//        String pool
//        String vừa có tính nguyên thủy, vừa có tính đối tượng
        extracted(a, b);
        // Override equals

        IAnimal student3 = new Student();
        IPerson student2 = new Student();
    }

    public static void extracted(String a, String b) {
        System.out.println(a.equals(b));
        Student student = new Student();
        Student student1 = new Student();
        System.out.println(student.equals(student1));
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
