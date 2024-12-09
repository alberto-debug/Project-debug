package com.springproject.registration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.Data;

import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

    private String name;
    private String email;
    private String address;
}
