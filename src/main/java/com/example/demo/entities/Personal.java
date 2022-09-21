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

    @Column(name = "name2")
    private String name2;

    @Column(name = "height")
    private String height;

    public Personal(String name2, String height) {
        this.name2 = name2;
        this.height = height;
    }

    public Personal() {

    }
}
