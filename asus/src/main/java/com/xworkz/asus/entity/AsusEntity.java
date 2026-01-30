package com.xworkz.asus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsusEntity {
    @Id
    int id;
    String name;
    int price;
}
