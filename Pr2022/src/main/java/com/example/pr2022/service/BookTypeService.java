package com.example.pr2022.service;

import com.example.pr2022.model.BookType;

import java.util.List;

public interface BookTypeService {
    List<BookType> findAll();

    BookType findById(Integer id);

    BookType create(BookType resource);
}
