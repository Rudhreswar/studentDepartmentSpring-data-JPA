package com.studentDepartment.controller;

import com.studentDepartment.dto.DepartmentRequest;
import com.studentDepartment.dto.DepartmentResponse;
import com.studentDepartment.entity.DepartmentEntity;
import com.studentDepartment.model.DepartmentModel;
import com.studentDepartment.repository.DepartmentRepository;
import com.studentDepartment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentDepartment")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addDetails")
    public DepartmentEntity addDetails(@RequestBody DepartmentRequest departmentRequest) {
        return departmentRepository.save(departmentRequest.getDepartmentEntityRequest());
    }

    @GetMapping("/getAllDetails")
    public List<DepartmentEntity> getDepartmentDetails() {
        return departmentRepository.findAll();
    }

}
