package co.usa.insw.clasemar15.repository;


import co.usa.insw.clasemar15.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private StudentCRUDRepository studentCRUDRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentCRUDRepository.findAll();
    }

    public Student save(Student s){
        return studentCRUDRepository.save(s);
    }


}
