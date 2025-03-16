package com.example.demospringex.service.impl;

import com.example.demospringex.dto.UserDto;
import com.example.demospringex.entity.User;
import com.example.demospringex.mapper.UserMapper;
import com.example.demospringex.repo.UserRepository;
import com.example.demospringex.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public UserDto createUser(UserDto userDto) {
        // Convert UserDto into User JPA Entity
        User user = UserMapper.mapToUser(userDto);
        User saved = repository.save(user);

        // Convert User JPA entity to UserDto
        UserDto savedUserDto = UserMapper.mapToUserDto(user);
        return savedUserDto;
    }

    @Override
    public UserDto findById(Long id) {
        Optional<User> optionalUser = repository.findById(id);
        User user = optionalUser.get();
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = repository.findAll();
        return users.stream().map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto update(UserDto user) {
        User existingUser = repository.findById(user.getId()).get();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        User saved = repository.save(existingUser);
        return UserMapper.mapToUserDto(saved);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
