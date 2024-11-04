package ss8_clean_code.entity.DTO;

import ss8_clean_code.entity.Student;

public class StudentDTO {
    String name;
    String address;
    double point;
    String className;

    public StudentDTO(String name, String address, double point, String className) {
        this.name = name;
        this.address = address;
        this.point = point;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
