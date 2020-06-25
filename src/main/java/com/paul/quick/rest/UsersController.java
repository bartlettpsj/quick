package com.paul.quick.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @GetMapping("")
    public List<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(1, "John", "Whats up"));
        users.add(new User(2, "Paul", "Now is the time to let it be"));
        users.add(new User(3, "George", "Peace"));
        users.add(new User(4, "Ringo", "Love and Pearce"));
        return users;
    }
}
