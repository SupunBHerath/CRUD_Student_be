package edu.iuhs.crud_student.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.iuhs.crud_student.entity.StudentEntity;
import edu.iuhs.crud_student.exception.impl.NotFoundException;
import edu.iuhs.crud_student.model.Student;
import edu.iuhs.crud_student.repository.StudentJpaRepository;
import edu.iuhs.crud_student.repository.StudentRepository;
import edu.iuhs.crud_student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final ObjectMapper mapper;
    private final StudentJpaRepository studentJpaRepository;
    private  final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
      return mapper.convertValue(
              studentJpaRepository.save(
                      mapper.convertValue(student, StudentEntity.class)),Student.class);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Iterable<StudentEntity> result = studentJpaRepository.findAll();
        result.forEach(data -> studentList.add(mapper.convertValue(data, Student.class)));
        return studentList;
    }

    @Override
    public boolean deleteStudentById(int id) {
        Optional<StudentEntity> result = studentJpaRepository.findById(id);
        if (result.isEmpty())  throw  new NotFoundException("Student Not Found");
        studentJpaRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateStudentById(Student student, int id) {
        if (studentRepository.updateStudentById(id,student) >0)  return true;
        return false;
        
    }
    @Override
    public Student getStudentById(int id){
        Optional<StudentEntity> result = studentJpaRepository.findById(id);
        if (result.isEmpty()) throw new NotFoundException("Student Not Found");
        return mapper.convertValue(result,Student.class);
    }


}
