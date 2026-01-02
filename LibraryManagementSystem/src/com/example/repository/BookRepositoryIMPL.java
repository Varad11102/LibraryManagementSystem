package com.example.repository;

import com.example.entity.Book;
import com.example.exception.EntityNotFoundException;
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
        boolean removed = books.removeIf(book -> book.getId() == id);
        if (!removed) {
            throw new EntityNotFoundException("Book with ID " + id + " not found");
        }
    }

    public void update(Book updatedBook) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == updatedBook.getId()) {
                books.set(i, updatedBook);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new EntityNotFoundException("Book with ID " + updatedBook.getId() + " not found");
        }
    }
}
