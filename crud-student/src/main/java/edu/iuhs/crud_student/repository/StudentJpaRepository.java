package edu.iuhs.crud_student.repository;

import edu.iuhs.crud_student.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentJpaRepository  extends CrudRepository<StudentEntity,Integer> {
}
