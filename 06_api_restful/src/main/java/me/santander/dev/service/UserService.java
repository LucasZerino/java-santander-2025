package me.santander.dev.service;

import me.santander.dev.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
