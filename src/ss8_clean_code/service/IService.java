package ss8_clean_code.service;

import ss8_clean_code.entity.Student;

import java.util.List;

public interface IService<T> {

    List<T> getAll();

    void save(T s);

    void update(int id, T s);

    void remove(int id);

    T findById(int id);

    List<T> findByName(String name);


}
