package tuugii.mn.registrar.service;

import tuugii.mn.registrar.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student save(Student student);
    Student findOne(Long id);
    void delete(Long id);

}
