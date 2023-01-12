package com.siva.springboot.mongoDemo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.springboot.mongoDemo.model.Student;
import com.siva.springboot.mongoDemo.respository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping(path = "/create")
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @GetMapping(path = "/getAll")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
