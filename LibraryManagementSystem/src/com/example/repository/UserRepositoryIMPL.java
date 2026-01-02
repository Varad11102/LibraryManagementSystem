package com.example.repository;


import com.example.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryIMPL {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> findAll() {
        return users;
    }

    public void deleteById(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    public void update(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == updatedUser.getId()) {
                users.set(i, updatedUser);
            }
        }
    }
}
