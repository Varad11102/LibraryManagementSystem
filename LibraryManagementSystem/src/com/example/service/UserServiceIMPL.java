package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepositoryIMPL;

import java.util.List;

public class UserServiceIMPL implements UserService {

    private UserRepositoryIMPL userRepository =  new UserRepositoryIMPL();

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.update(user);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
