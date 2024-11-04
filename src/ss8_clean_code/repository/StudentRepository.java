package ss8_clean_code.repository;

import ss8_clean_code.entity.DTO.StudentDTO;
import ss8_clean_code.entity.Student;
import ss8_clean_code.utils.IOFile.IOFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //    Generic
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G2"));
        students.add(new Student(2, "Nguyễn Văn B", "Hải Phòng", 8, "C0724G2"));
        students.add(new Student(3, "Nguyễn Văn C", "Đà Nẵng", 7, "C0724G1"));
        students.add(new Student(5, "Nguyễn Văn D", "TP.HCM", 8, "C0724G1"));
        students.add(new Student(6, "Nguyễn Văn E", "Bắc Giang", 4, "C0724G3"));
        students.add(new Student(7, "Nguyễn Văn F", "Huế", 6, "C0724G3"));
        students.add(new Student(8, "Nguyễn Văn G", "Quảng Trị", 9, "C0724G1"));
        students.add(new Student(9, "Nguyễn Văn H", "Nghệ An", 9, "C0724G4"));
        students.add(new Student(10, "Nguyễn Văn J", "Thanh hóa", 10, "C0724G4"));
    }

    public List<Student> getAll() {
        return students;
    }

    public void save(Student s) {
        students.add(s);

        IOFile.writeFile(students, false);
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (id == student.getCode()) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        Student student = findStudent(id);
        if (student == null) {
            System.out.println("Student" + student.getName() + " đã bị xóa trước đó!)");
        }
        System.out.println("Đã xóa thành công student có id: " + id + " và có tên là : " + student.getName());
        students.removeIf(s -> id == s.getCode());
    }

    public void updateStudent(int id, StudentDTO studentDto) {
        Student student = findStudent(id);
        if (student == null) {
            System.out.println("Student" + student.getName() + " đã bị xóa trước đó!)");
        }
        student.setName(studentDto.getName());
        student.setAddress(studentDto.getAddress());
        student.setPoint(studentDto.getPoint());
        student.setClassName(studentDto.getClassName());
    }
}
