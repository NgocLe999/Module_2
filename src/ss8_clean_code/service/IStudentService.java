package ss8_clean_code.service;

import ss8_clean_code.entity.DTO.StudentDTO;
import ss8_clean_code.entity.Student;

import java.util.List;

public interface IStudentService extends IService<Student> {

    void updateStudentById(int id, StudentDTO studentDto);

}
