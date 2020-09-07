package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.User;
import com.thoughtworks.capability.gtb.entrancequiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin
public class Controller {
    @Autowired
    UserService userService;

    @GetMapping(path = "userList")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GetMapping(path = "userRandomList")
    public List<User> getUserRandomList() {
        return userService.randomUser();
    }

    @PostMapping(path = "addUser")
    public void addUser(@RequestBody String name) {
        userService.addUser(name);
    }
}
