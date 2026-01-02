package com.example.service;

import com.example.entity.Book;
import java.util.List;

public interface BookService {

    void addBook(Book book);

    void deleteBook(int id);

    void updateBook(Book book);

    List<Book> listBooks();
}
