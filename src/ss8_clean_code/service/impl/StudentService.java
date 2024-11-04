package ss8_clean_code.service.impl;

import ss8_clean_code.entity.DTO.StudentDTO;
import ss8_clean_code.entity.Student;
import ss8_clean_code.repository.StudentRepository;
import ss8_clean_code.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();

        return students;
    }

    @Override
    public void save(Student s) {
        studentRepository.save(s);
    }

    @Override
    public void update(int id, Student s) {
        
    }

    @Override
    public void updateStudentById(int id, StudentDTO studentDto) {
        studentRepository.updateStudent(id, studentDto);
    }

    @Override
    public void remove(int id) {
        studentRepository.deleteStudent(id);
    }

    @Override
    public Student findById(int id) {
        Student student = studentRepository.findStudent(id);
        if (student == null) {
            return null;
        }
        return student;
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> students = studentRepository.getAll();
        List<Student> temp = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                temp.add(student);
            }
        }
        return temp;
    }


}
