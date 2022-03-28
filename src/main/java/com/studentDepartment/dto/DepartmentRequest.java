package com.studentDepartment.dto;

import com.studentDepartment.entity.DepartmentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class DepartmentRequest {
    private DepartmentEntity departmentEntityRequest;
}
