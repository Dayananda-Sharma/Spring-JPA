package com.xworkz.puma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "query_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByName",
        query = "select ne from NamedQueryEntity ne where ne.name =:nameby ")

@NamedQuery(name = "findbyEmail",
        query = "select mail from NamedQueryEntity mail where mail.email=:emailby")

@NamedQuery(name = "findbyphoneNumber",
        query = "select number from NamedQueryEntity number where number.phoneNumber=:numberby")

@NamedQuery(name = "findPhAndEmail",
        query = "select nq from NamedQueryEntity nq where nq.phoneNumber=:numberby And nq.email=:emailby")


@NamedQuery(name = "getMaxInAge",
        query = "select MAX(nq.age) from NamedQueryEntity nq")


@NamedQuery(name = "getMinInAge",
        query = "select MIN(nq.age) from NamedQueryEntity nq")

public class NamedQueryEntity {
    @Id
    private int id;
    private String name;
    private long phoneNumber;
    private int age;
    private String email;
}
