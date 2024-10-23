package edu.iuhs.crud_student.service;

import edu.iuhs.crud_student.entity.StudentEntity;
import edu.iuhs.crud_student.model.Student;

import java.util.List;

public interface StudentService {

    public Student save(Student student);
    public List<Student> getAllStudents();
    public  boolean deleteStudentById(int id) ;
    boolean updateStudentById(Student student, int id);
    Student getStudentById(int id);
}
