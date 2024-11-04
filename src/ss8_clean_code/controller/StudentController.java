package ss8_clean_code.controller;

import ss8_clean_code.entity.DTO.StudentDTO;
import ss8_clean_code.entity.Student;
import ss8_clean_code.service.IStudentService;
import ss8_clean_code.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public List<Student> searchByName(String name) {
        return studentService.findByName(name);
    }

    public void save(Student student) {
        studentService.save(student);
    }

    public Student getStudentById(int id) {
        Student student = studentService.findById(id);
        if (student == null) {
            return null;
        }
        return student;
    }

    public void deleteStudentById(int id) {
        studentService.remove(id);
    }

    public void updateStudentById(int id, StudentDTO studentDto) {
        studentService.updateStudentById(id, studentDto);
    }

}
