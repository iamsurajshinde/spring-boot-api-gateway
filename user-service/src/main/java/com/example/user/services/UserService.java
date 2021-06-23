package com.example.user.services;

import com.example.user.entities.User;
import com.example.user.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user) {
        log.info("Inside saveDepartment of UserService");
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        log.info("Inside findUserById of UserService");
        Optional<User> user = userRepository.findById(id);
        return user.isPresent() ? user.get() : null ;
    }
}
