package com.example.entity;

public class Book {
    private int id;
    private String title;
    private String description;
    private int price;
    private String author;
    private String publisher;

    public Book() {}

    public Book(int id, String title, String description, int price, String author, String publisher) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{id=" + id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", price=" + price +
               ", author='" + author + '\'' +
               ", publisher='" + publisher + '\'' +
               '}';
    }
}
