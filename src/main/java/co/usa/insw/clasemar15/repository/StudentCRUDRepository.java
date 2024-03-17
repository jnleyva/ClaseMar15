package co.usa.insw.clasemar15.repository;

import co.usa.insw.clasemar15.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCRUDRepository extends CrudRepository<Student,Long> {
}
