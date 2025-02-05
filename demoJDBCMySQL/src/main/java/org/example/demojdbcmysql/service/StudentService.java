package org.example.demojdbcmysql.service;

import org.example.demojdbcmysql.entity.Student;
import org.example.demojdbcmysql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
