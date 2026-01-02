package com.example.repository;


import com.example.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryIMPL {
    private List<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public List<Book> findAll() {
        return books;
    }

    public void deleteById(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void update(Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == updatedBook.getId()) {
                books.set(i, updatedBook);
            }
        }
    }
}
