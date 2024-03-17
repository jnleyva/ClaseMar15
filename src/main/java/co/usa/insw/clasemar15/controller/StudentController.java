package co.usa.insw.clasemar15.controller;

import co.usa.insw.clasemar15.entities.Student;
import co.usa.insw.clasemar15.repository.StudentRepository;
import co.usa.insw.clasemar15.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holamundo")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/hi")
    public String saludar(){
        return "HOLA MUNDO!";
    }

    @GetMapping("/students")
    public List<Student> getAllSt(){
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public Student saveStudent(@RequestBody Student s){
        return studentService.save(s);
    }

}
