package com.xworkz.rapido.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rapido_tb")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RapidoEntity {
    @Id
    private int id;
    private String name;
    private long number;
}
