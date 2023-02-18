package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers();
    public void saveUser(User user);
    public User getUserById(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
}
