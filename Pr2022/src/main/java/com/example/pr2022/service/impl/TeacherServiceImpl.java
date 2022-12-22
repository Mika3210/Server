package com.example.pr2022.service.impl;

import com.example.pr2022.model.Teacher;
import com.example.pr2022.model.Titul;
import com.example.pr2022.repository.TeacherRepository;
import com.example.pr2022.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository repository;
private final TitulServiceImpl titulService;
    @Autowired
    public TeacherServiceImpl(TeacherRepository repository, TitulServiceImpl titulService) {
        this.repository = repository;
        this.titulService = titulService;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> Teachers = repository.findAll();
        return repository.findAll();
    }

    @Override
    public Teacher findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Teacher create(Teacher resource) {
        Titul titul = titulService.findById(resource.getTitulId());
        resource.setTitul(titul);
        return repository.saveAndFlush(resource);
    }
}
