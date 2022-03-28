package com.studentDepartment.repository;

import com.studentDepartment.dto.DepartmentResponse;
import com.studentDepartment.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {


}
