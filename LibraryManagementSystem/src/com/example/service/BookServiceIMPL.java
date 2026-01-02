package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepositoryIMPL;

import java.util.List;

public class BookServiceIMPL implements BookService {
    private BookRepositoryIMPL repository = new BookRepositoryIMPL();

    public void addBook(Book book) {
        repository.save(book);
    }

    public void deleteBook(int id) {
        repository.deleteById(id);
    }

    public void updateBook(Book book) {
        repository.update(book);
    }

    public List<Book> listBooks() {
        return repository.findAll();
    }
}
