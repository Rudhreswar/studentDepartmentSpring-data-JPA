package com.studentDepartment.repository;

import com.studentDepartment.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


}
