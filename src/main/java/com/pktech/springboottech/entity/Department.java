package com.pktech.springboottech.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    //@NotBlank(message = "Please Add Department Name")
    //@Length(max=5,min=1)
    //@Size(max=10, min=0)
    //@Email
    //@PositiveOrZero
    //@NegativeOrZero
    //@Future
    //@FutureOrPresent
    //@Past
    //@PastOrPresent
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}