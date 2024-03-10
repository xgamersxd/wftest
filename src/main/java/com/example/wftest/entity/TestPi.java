package com.example.wftest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "multiplication")
public class TestPi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double value;

    public TestPi() {
    }

    public Integer getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}