package com.xworkz.inspiron.entity;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@AllArgsConstructor
public class DellEntity {
    @Id
    private int id;
    private String name;
    private int price;
}
