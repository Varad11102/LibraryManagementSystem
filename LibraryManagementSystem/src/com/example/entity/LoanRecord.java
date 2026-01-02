package com.example.entity;

public class LoanRecord {
    private int id;
    private String borrowDate;
    private String dueDate;
    private String returnDate;

    public LoanRecord() {}

    public LoanRecord(int id, String borrowDate, String dueDate, String returnDate) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "LoanRecord{id=" + id +
               ", borrowDate='" + borrowDate + '\'' +
               ", dueDate='" + dueDate + '\'' +
               ", returnDate='" + returnDate + '\'' +
               '}';
    }
}
