package com.example.pr2022.repository;


import com.example.pr2022.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Teacher findTeacherByFamiliya(String familiya);
}
