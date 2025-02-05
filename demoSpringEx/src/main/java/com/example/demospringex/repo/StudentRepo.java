package com.example.demospringex.repo;

import com.example.demospringex.entity.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        jdbcTemplate.update("insert into student (id, name, age) values(?,?,?)", student.getId(), student.getName(), student.getAge());
//        System.out.println(rows + "save student");
        System.out.println("Saving student");

    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
