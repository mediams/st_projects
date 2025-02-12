package org.example.demojdbcmysql.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.example.demojdbcmysql.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Student findById(int id) {
        return em.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return em.createQuery("from Student order by lastName DESC ", Student.class).getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> theQuery = em.createQuery("from Student where lastName = :lastName", Student.class);
        theQuery.setParameter("lastName", lastName);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        em.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = em.find(Student.class, id);
        em.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        return em.createQuery("delete from Student").executeUpdate();
    }
}
