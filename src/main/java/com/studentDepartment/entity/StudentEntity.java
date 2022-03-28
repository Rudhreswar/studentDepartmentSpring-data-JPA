package com.studentDepartment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
public class StudentEntity {
    @Id
    private String rollNo;
    private String name;

}
