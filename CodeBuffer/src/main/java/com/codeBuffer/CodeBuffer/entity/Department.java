package com.codeBuffer.CodeBuffer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Department {
    // to get a primary key just as we use it in relational database
    @Id
    // to generate primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    // adding a validator to make sure the department name is not blank
    @NotBlank(message = "Please add department name " )
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
