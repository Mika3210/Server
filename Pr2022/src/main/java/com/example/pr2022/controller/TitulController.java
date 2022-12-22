package com.example.pr2022.controller;

import com.example.pr2022.model.Titul;
import com.example.pr2022.service.TitulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tituls")
public class TitulController {


    private final TitulService service;
    @Autowired
    public TitulController(TitulService service) {
        this.service = service;
    }

    @GetMapping
    public List<Titul> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Titul findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Titul create(@RequestBody Titul resource) {
        return service.create(resource);
    }
}
