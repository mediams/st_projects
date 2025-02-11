package org.example.demojdbcmysql.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.demojdbcmysql.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager em;

    @Autowired
    public StudentDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Student student) {
        System.out.println("Inside save");
        em.persist(student);
    }
}
