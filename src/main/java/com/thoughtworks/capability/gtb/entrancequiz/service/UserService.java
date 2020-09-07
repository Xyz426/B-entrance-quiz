package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();
    List<User> newUserList;

    {
        userList.add(new User(1, "沈乐棋"));
        userList.add(new User(2, "徐慧慧"));
        userList.add(new User(3, "陈思聪"));
        userList.add(new User(4, "王江林"));
        userList.add(new User(5, "王登宇"));
        userList.add(new User(6, "杨思雨"));
        userList.add(new User(7, "江雨舟"));
        userList.add(new User(8, "廖燊"));
        userList.add(new User(9, "胡晓"));
        userList.add(new User(10, "但杰"));
        userList.add(new User(11, "盖迈达"));
        userList.add(new User(12, "肖美琦"));
        userList.add(new User(13, "黄云洁"));
        userList.add(new User(14, "齐瑾浩"));
        userList.add(new User(15, "刘亮亮"));
        userList.add(new User(16, "肖逸凡"));
        userList.add(new User(17, "王作文"));
        userList.add(new User(18, "郭瑞凌"));
        userList.add(new User(19, "李明豪"));
        userList.add(new User(20, "党泽"));
        userList.add(new User(21, "肖伊佐"));
        userList.add(new User(22, "贠晨曦"));
        userList.add(new User(23, "李康宁"));
        userList.add(new User(24, "马庆"));
        userList.add(new User(25, "商婕"));
        userList.add(new User(26, "余榕"));
        userList.add(new User(27, "谌哲"));
        userList.add(new User(28, "董翔锐"));
        userList.add(new User(29, "陈泰宇"));
        userList.add(new User(30, "赵允齐"));
        userList.add(new User(31, "张柯"));
        userList.add(new User(32, "廖文强"));
        userList.add(new User(33, "刘轲"));
        userList.add(new User(34, "廖浚斌"));
        userList.add(new User(35, "凌凤仪"));
    }

    public List<User> getUserList(){
        return userList;
    }

    public List<User> randomUser(){
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

    public void addUser(String name) {
        userList.add(new User(userList.size()+1,name));
        System.out.println(userList.size());
    }
}
