package com.example.autoecoleflutter.service;

import com.example.autoecoleflutter.entity.User;
import com.example.autoecoleflutter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(int id_user) {
        return userRepository.findById(id_user).orElse(null);
    }
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id_user, User user) {
        if (userRepository.existsById(id_user)) {
            user.setId(id_user);
            return userRepository.save(user);
        }
        return null; // Handle non-existing user
    }

    public void deleteUser(int id_user) {
        userRepository.deleteById(id_user);
    }

    public boolean validatePassword(String email, String password) {
        User user = userRepository.findByEmail(email).orElse(null);
        return user != null && password.equals(user.getPassword());
    }
}
