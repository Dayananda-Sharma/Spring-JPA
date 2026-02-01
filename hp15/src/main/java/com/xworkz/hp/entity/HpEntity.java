package com.xworkz.hp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@Data
public class HpEntity {
    @Id
    private int id;
    private String name;
    private int price;
}
