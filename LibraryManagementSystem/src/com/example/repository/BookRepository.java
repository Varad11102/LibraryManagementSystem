package com.example.repository;

import com.example.entity.Book;
import java.util.List;

public interface BookRepository {

    void save(Book book);

    List<Book> findAll();

    void deleteById(int id);

    void update(Book book);
}
