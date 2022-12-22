package com.example.pr2022.controller;

import com.example.pr2022.model.Book;
import com.example.pr2022.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;
    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }


    @GetMapping
    public List<Book> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Book findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book resource) {
        return service.create(resource);
    }

    @GetMapping(value = "years")
    public List<Integer> findOfYears(){
        return  service.findYears();
    }
}
