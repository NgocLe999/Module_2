package ss8_clean_code.service.impl;

import ss8_clean_code.entity.Teacher;
import ss8_clean_code.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public void save(Teacher s) {

    }

    @Override
    public void update(int id, Teacher s) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Teacher findById(int id) {
        return null;
    }

    @Override
    public List<Teacher> findByName(String name) {
        return List.of();
    }
}
