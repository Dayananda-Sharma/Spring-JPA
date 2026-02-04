package com.xworkz.aakash.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tb")
@NoArgsConstructor
@Data

public class AakashEntity {
    @Id
    private int student_id;
    private String student_name;
    private String student_location;
}
