package com.vault.example.service.impl;

import com.vault.example.entity.User;
import com.vault.example.repository.UserRepository;
import com.vault.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByUsername(String userName) {
        return userRepository.findAll()
                .stream().filter(user -> user.getUsername().equalsIgnoreCase(userName))
                .findFirst().get();
    }
}
