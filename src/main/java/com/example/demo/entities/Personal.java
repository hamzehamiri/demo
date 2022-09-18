package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persons" , schema = "hamzehschema")
@Setter
@Getter
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "height")
    private String height;

    public Personal(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public Personal() {

    }
}
