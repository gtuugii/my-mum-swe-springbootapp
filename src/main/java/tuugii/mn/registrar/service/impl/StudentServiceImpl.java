package tuugii.mn.registrar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tuugii.mn.registrar.domain.Student;
import tuugii.mn.registrar.repository.StudentRepository;
import tuugii.mn.registrar.service.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findOne(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);
	}

}
