package com.siva.springboot.mongoDemo.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siva.springboot.mongoDemo.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
