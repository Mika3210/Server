package com.example.pr2022.repository;

import com.example.pr2022.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookByBookName(String name);

    ArrayList<Book> findAll();
}
