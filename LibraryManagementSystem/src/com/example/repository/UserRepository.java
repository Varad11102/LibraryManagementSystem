package com.example.repository;


import com.example.entity.User;
import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> findAll();

    void deleteById(int id);

    void update(User user);
}
