package com.xworkz.microsoft.entity;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@AllArgsConstructor

public class MicrosoftEntity {
    @Id
    int id;
    String name;
    int price;
}
