package co.usa.insw.clasemar15.service;


import co.usa.insw.clasemar15.entities.Student;
import co.usa.insw.clasemar15.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents(){

        return studentRepository.getAllStudents();

    }

    public Student save(Student s){

        if(s.getLastName().equals("Leyva")){
            return null;
        }

        return studentRepository.save(s);
    }
}
