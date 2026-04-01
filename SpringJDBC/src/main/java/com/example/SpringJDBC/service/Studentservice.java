package com.example.SpringJDBC.service;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Studentservice {
    @Autowired
    private Studentrepo repo;

    public List<Student> getstudents() {
        return repo.findall();
    }

    public void addstudent(Student s1) {
        repo.save(s1);
    }

    public Studentrepo getRepo() {
        return repo;
    }

    public void setRepo(Studentrepo repo) {
        this.repo = repo;
    }
}
