package com.example.pr2022.repository;

import com.example.pr2022.model.Book;
import com.example.pr2022.model.BookType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTypeRepository extends JpaRepository<BookType, Integer> {
    BookType findBookTypeByTypeName(String name);
}
