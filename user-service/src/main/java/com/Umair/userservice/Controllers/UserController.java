package com.Umair.userservice.Controllers;

import com.Umair.userservice.Entities.User;
import com.Umair.userservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(id));
    }

    @PostMapping
    public ResponseEntity<User> getUserById(@RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }


}
