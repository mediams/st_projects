package com.example.demospringex.service.impl;

import com.example.demospringex.entity.User;
import com.example.demospringex.repo.UserRepository;
import com.example.demospringex.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findById(Long id) {
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User update(User user) {
        User existingUser = repository.findById(user.getId()).get();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return repository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
