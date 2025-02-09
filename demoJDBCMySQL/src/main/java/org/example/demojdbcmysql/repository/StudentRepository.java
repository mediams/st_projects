package org.example.demojdbcmysql.repository;

import lombok.Getter;
import lombok.Setter;
import org.example.demojdbcmysql.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Getter
@Setter
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
//        int rows = jdbcTemplate.update("insert into student (id, name, age) values (?, ?, ?)", student.getId(), student.getName(), student.getAge());
        System.out.println(/*rows + */" rows inserted");
    }

    public List<Student> findAll() {
        String sql = "select * from student";
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return student;
            }
        };
        return jdbcTemplate.query(sql, rowMapper);
    }
}
