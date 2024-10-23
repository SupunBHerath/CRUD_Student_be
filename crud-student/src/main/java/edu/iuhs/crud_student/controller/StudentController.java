package edu.iuhs.crud_student.controller;

import edu.iuhs.crud_student.entity.StudentEntity;
import edu.iuhs.crud_student.model.Student;
import edu.iuhs.crud_student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private  final StudentService service;

    @PostMapping
    public Student save(@RequestBody  Student student){
       return service.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
       return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable int id){
        return service.deleteStudentById(id);
    }

    @PutMapping("/{id}")
    public boolean updateStudentById(@RequestBody Student student , @PathVariable int id){
      return service.updateStudentById(student,id);
    }
}
