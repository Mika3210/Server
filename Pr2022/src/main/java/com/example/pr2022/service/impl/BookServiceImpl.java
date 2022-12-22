package com.example.pr2022.service.impl;

import com.example.pr2022.model.Book;
import com.example.pr2022.repository.BookRepository;
import com.example.pr2022.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final BookTypeServiceImpl bookTypeService;
    private final TeacherServiceImpl teacherService;

    @Autowired
    public BookServiceImpl(BookRepository repository, BookTypeServiceImpl bookTypeService, TeacherServiceImpl teacherService) {
        this.repository = repository;
        this.bookTypeService = bookTypeService;
        this.teacherService = teacherService;
    }

    @Override
    public List<Book> findAll() {
        List<Book> Book = repository.findAll();
        return repository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Book create(Book resource) {
        resource.setBookType(bookTypeService.findById(resource.getBookTypeId()));
        resource.setAuthor(teacherService.findById(resource.getAuthorId()));

        return repository.saveAndFlush(resource);
    }

    @Override
    public List<Integer> findYears() {
        List<Book> books = repository.findAll();
       List<Integer> years = new ArrayList<>();
        for(int i=0; i<books.size();i++){
            years.add(books.get(i).getPublishYear());

        }
        return years;
    }


}
