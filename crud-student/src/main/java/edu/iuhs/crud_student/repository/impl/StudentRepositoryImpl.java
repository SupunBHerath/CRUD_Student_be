package edu.iuhs.crud_student.repository.impl;

import edu.iuhs.crud_student.model.Student;
import edu.iuhs.crud_student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository

public class StudentRepositoryImpl  implements StudentRepository {

    private  final JdbcTemplate jdbcTemplate;

    public int updateStudentById(int id, Student student) {
        String sql = "UPDATE student SET s_name = ?, s_age = ?, s_contact_number = ?,g_name =? ,g_address = ? , g_contact_number = ?  WHERE id = ?";

        return jdbcTemplate.update(
                sql,
                student.getS_name(),
                student.getS_age(),
                student.getS_contact_number(),
                student.getG_name(),
                student.getG_address(),
                student.getG_contact_number(),
                id);

    }
}
