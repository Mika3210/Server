package com.example.pr2022.controller;


import com.example.pr2022.model.BookType;
import com.example.pr2022.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booktypes")
public class BookTypeController {

    private final BookTypeService service;
    @Autowired
    public BookTypeController(BookTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BookType> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public BookType findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookType create(@RequestBody BookType resource) {

        resource=resource;
        return service.create(resource);
    }
}
