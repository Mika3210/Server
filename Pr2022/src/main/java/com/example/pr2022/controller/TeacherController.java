package com.example.pr2022.controller;

import com.example.pr2022.model.Teacher;
import com.example.pr2022.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {


    private final TeacherService service;
    @Autowired
    public TeacherController(TeacherService service) {
        this.service = service;
    }


    @GetMapping
    public List<Teacher> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Teacher findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher create(@RequestBody Teacher resource) {

        resource.getVyz();
        return service.create(resource);
    }
}
