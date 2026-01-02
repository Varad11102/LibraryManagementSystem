package com.example.service;

import com.example.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    List<User> listUsers();
}
