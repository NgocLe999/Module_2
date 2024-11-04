package ss8_clean_code.utils.compare;

import ss8_clean_code.entity.Student;

import java.util.Comparator;

public class StudentCompareByPoint implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getPoint() > o2.getPoint()) {
            return 1;
        } else if(o1.getPoint() == o2.getPoint()) {
            return 0;
        }
        return -1;
    }
}
