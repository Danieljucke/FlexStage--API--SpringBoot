package com.example.flexstageapi.Entities;

import javax.persistence.*;

@Table(name = "ville")
@Entity
public class VilleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}