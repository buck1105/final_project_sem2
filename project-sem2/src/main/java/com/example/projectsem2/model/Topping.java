package com.example.projectsem2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Data
public class Topping {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "topping")
    private String topping;
    @OneToMany(mappedBy = "toppingByToppingId")
    private Collection<OrderDetail> orderDetailsById;
}
