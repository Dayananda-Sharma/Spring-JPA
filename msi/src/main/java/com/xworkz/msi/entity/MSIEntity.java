package com.xworkz.msi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@AllArgsConstructor
@Data
public class MSIEntity {
    @Id
    int id;
    String name;
    int price;

}
