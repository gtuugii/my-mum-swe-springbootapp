package tuugii.mn.registrar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tuugii.mn.registrar.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
