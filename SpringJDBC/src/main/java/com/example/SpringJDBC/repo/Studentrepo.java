package com.example.SpringJDBC.repo;

import com.example.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo {
    @Autowired
    private JdbcTemplate jdbc;

    public void save(Student s) {
        String sql = "insert into student (roll_no, name, marks) values(?,?,?)";
        // Meaning of the above query:-  Insert a new row into the student table, setting the values of roll_no, name, and marks — the actual values will be provided later.
        jdbc.update(sql,s.getRoll_no(),s.getName(),s.getMarks());

    }

    public List<Student> findall() {
        String sql = "select * from student";
        // RowMapper is a interface
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRoll_no(rs.getInt("roll_no"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };

        return jdbc.query(sql,mapper);
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    //@Autowired //spring will create a jdbc instances
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}