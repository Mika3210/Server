package com.example.pr2022.service.impl;

import com.example.pr2022.model.BookType;
import com.example.pr2022.repository.BookTypeRepository;
import com.example.pr2022.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTypeServiceImpl implements BookTypeService {
    private final BookTypeRepository repository;

    @Autowired
    public BookTypeServiceImpl(BookTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BookType> findAll() {
        List<BookType> BookType = repository.findAll();
        return repository.findAll();
    }

    @Override
    public BookType findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public BookType create(BookType resource) {
        return repository.saveAndFlush(resource);
    }
}
