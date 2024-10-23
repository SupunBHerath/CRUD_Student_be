package edu.iuhs.crud_student.repository;

import edu.iuhs.crud_student.model.Student;

public interface StudentRepository {
    public int updateStudentById(int id, Student student);
}
