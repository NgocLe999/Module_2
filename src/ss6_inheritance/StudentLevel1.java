package ss6_inheritance;

public class StudentLevel1 extends Student{
    private boolean isBanTru;

    public StudentLevel1() {
    }

    public StudentLevel1(int id, String name, String address, double point, String className, boolean isBanTru) {
        super(id, name, address, point, className);
        super.getCode();
        this.isBanTru = isBanTru;
    }
}
