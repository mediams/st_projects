package org.example.demojdbcmysql;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImplement {

    private EntityManager entityManager;

    @Autowired
    public StudentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }




}
