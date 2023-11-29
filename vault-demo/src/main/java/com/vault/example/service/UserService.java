package com.vault.example.service;

import com.vault.example.entity.User;

public interface UserService {
    User addUser(final User user);
    User getUserByUsername(final String userName);
}
