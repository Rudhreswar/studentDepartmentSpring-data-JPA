package com.studentDepartment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue
    private int deptId;
    private String deptName;

    @OneToMany(targetEntity = StudentEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "SD_FK", referencedColumnName = "deptId")
    private List<StudentEntity> studentEntities;

}
