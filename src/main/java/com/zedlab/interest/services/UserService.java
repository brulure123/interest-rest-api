package com.zedlab.interest.services;

import com.zedlab.interest.entities.User;
import com.zedlab.interest.exceptions.UserNotFoundException;
import com.zedlab.interest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository userRepository) {
        repository = userRepository;
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User findUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
