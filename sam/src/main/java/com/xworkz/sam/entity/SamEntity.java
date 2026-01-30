package com.xworkz.sam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@AllArgsConstructor
@Data
public class SamEntity {
    @Id
    int id;
    String name;
    int price;
}
