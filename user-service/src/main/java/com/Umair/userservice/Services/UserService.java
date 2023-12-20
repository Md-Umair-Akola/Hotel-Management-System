package com.Umair.userservice.Services;

import com.Umair.userservice.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getUser(String id);

    List<User> getAllUsers();

    User addUser(User user);

}
