package com.xworkz.hero.entity;

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
public class HeroEntity {
    @Id
   private int id;
   private String name;
  private  int price;
}
