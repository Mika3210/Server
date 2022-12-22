package com.example.pr2022.service;

import com.example.pr2022.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(Integer id);

    Book create(Book resource);

    List<Integer> findYears();
}
