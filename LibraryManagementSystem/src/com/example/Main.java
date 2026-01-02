package com.example;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.entity.LoanRecord;
import com.example.exception.EntityNotFoundException;
import com.example.service.BookService;
import com.example.service.BookServiceIMPL;
import com.example.service.UserService;
import com.example.service.UserServiceIMPL;
import com.example.service.LoanRecordService;
import com.example.service.LoanRecordServiceIMPL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookService bookService = new BookServiceIMPL();
        UserService userService = new UserServiceIMPL();
        LoanRecordService loanService = new LoanRecordServiceIMPL();

        int choice;

        do {
            showMenu();
            choice = readInt(sc, "Enter choice: ");

            switch (choice) {
                case 1:
                    addBook(sc, bookService);
                    break;

                case 2:
                    bookService.listBooks().forEach(System.out::println);
                    break;

                case 3:
                    try {
                        int delBookId = readInt(sc, "Enter Book ID to delete: ");
                        bookService.deleteBook(delBookId);
                        System.out.println("Book deleted");
                    } catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    addUser(sc, userService);
                    break;

                case 5:
                    userService.listUsers().forEach(System.out::println);
                    break;

                case 6:
                    try {
                        int delUserId = readInt(sc, "Enter User ID to delete: ");
                        userService.deleteUser(delUserId);
                        System.out.println("User deleted");
                    } catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    addLoanRecord(sc, loanService);
                    break;

                case 8:
                    loanService.listLoanRecords().forEach(System.out::println);
                    break;

                case 9:
                    try {
                        int delLoanId = readInt(sc, "Enter Loan ID to delete: ");
                        loanService.deleteLoanRecord(delLoanId);
                        System.out.println("Loan record deleted");
                    } catch (EntityNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. List Books");
        System.out.println("3. Delete Book");
        System.out.println("4. Add User");
        System.out.println("5. List Users");
        System.out.println("6. Delete User");
        System.out.println("7. Add Loan Record");
        System.out.println("8. List Loan Records");
        System.out.println("9. Delete Loan Record");
        System.out.println("0. Exit");
    }

    private static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    private static String readLine(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    private static void addBook(Scanner sc, BookService bookService) {
        int id = readInt(sc, "Book ID: ");
        sc.nextLine();
        String title = readLine(sc, "Title: ");
        String desc = readLine(sc, "Description: ");
        int price = readInt(sc, "Price: ");
        sc.nextLine();
        String author = readLine(sc, "Author: ");
        String publisher = readLine(sc, "Publisher: ");

        bookService.addBook(new Book(id, title, desc, price, author, publisher));
        System.out.println("Book added successfully");
    }

    private static void addUser(Scanner sc, UserService userService) {
        int id = readInt(sc, "User ID: ");
        sc.nextLine();
        String username = readLine(sc, "Username: ");
        String fullName = readLine(sc, "Full Name: ");
        long contact = Long.parseLong(readLine(sc, "Contact No: "));
        String email = readLine(sc, "Email: ");
        String password = readLine(sc, "Password: ");
        String role = readLine(sc, "Role: ");
        String dob = readLine(sc, "DOB: ");

        userService.addUser(new User(id, username, fullName, contact, email, password, role, dob));
        System.out.println("User added successfully");
    }

    private static void addLoanRecord(Scanner sc, LoanRecordService loanService) {
        int id = readInt(sc, "Loan ID: ");
        sc.nextLine();
        String borrowDate = readLine(sc, "Borrow Date: ");
        String dueDate = readLine(sc, "Due Date: ");
        String returnDate = readLine(sc, "Return Date: ");

        loanService.addLoanRecord(new LoanRecord(id, borrowDate, dueDate, returnDate));
        System.out.println("Loan record added successfully");
    }
}
