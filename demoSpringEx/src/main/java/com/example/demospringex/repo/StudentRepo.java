package com.example.demospringex.repo;

import com.example.demospringex.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student student) {
        System.out.println("save student");
    }

    public List<Student> findAll() {
jdbc.    }
}
