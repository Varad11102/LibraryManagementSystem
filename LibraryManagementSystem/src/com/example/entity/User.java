package com.example.entity;

public class User {
    private int id;
    private String userName;
    private String fullName;
    private long contactNo;
    private String email;
    private String password;
    private String role;
    private String dob;

    public User() {}

    public User(int id, String userName, String fullName, long contactNo,
                String email, String password, String role, String dob) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{id=" + id +
               ", userName='" + userName + '\'' +
               ", fullName='" + fullName + '\'' +
               ", contactNo=" + contactNo +
               ", email='" + email + '\'' +
               ", role='" + role + '\'' +
               ", dob='" + dob + '\'' +
               '}';
    }
}
