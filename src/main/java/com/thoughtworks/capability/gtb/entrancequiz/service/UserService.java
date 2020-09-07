package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    List<User> newUserList;
    public List<User> randomUser(List<User> userList){
        newUserList = new ArrayList<>(userList);
        Collections.shuffle(newUserList);
        return addGroup(newUserList);
    }

    public List<User> addGroup(List<User> userList){
        for (int i = 0; i < userList.size(); i++) {
            userList.get(i).setGroupId(i%6 + 1);
        }

        return userList;
    }
}
