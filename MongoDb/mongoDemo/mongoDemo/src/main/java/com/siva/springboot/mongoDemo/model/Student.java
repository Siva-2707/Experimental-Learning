package com.siva.springboot.mongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {

    @Id
    private int id;

    private String name;
    private int age;
    private String dateOfBirth;

}
