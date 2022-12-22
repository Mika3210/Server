package com.example.pr2022.service;

import com.example.pr2022.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();

    Teacher findById(Integer id);

    Teacher create(Teacher resource);
}
