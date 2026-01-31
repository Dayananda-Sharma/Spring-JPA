package com.xworkz.pavilion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HpEntity {
    @Id
    private int id;
    private String name;
    private int price;

}
