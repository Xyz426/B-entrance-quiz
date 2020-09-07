package com.thoughtworks.capability.gtb.api;

import com.thoughtworks.capability.gtb.domain.User;
import com.thoughtworks.capability.gtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class Controller {
    @Autowired
    UserService userService;

    static List<User> userList = Arrays.asList(
            new User(1,"沈乐棋"),
            new User(2,"徐慧慧"),
            new User(3,"陈思聪"),
            new User(4,"王江林"),
            new User(5,"王登宇"),
            new User(6,"杨思雨"),
            new User(7,"江雨舟"),
            new User(8,"廖燊"),
            new User(9,"胡晓"),
            new User(10,"但杰"),
            new User(11,"盖迈达"),
            new User(12,"肖美琦"),
            new User(13,"黄云洁"),
            new User(14,"齐瑾浩"),
            new User(15,"刘亮亮"),
            new User(16,"肖逸凡"),
            new User(17,"王作文"),
            new User(18,"郭瑞凌"),
            new User(19,"李明豪"),
            new User(20,"党泽"),
            new User(21,"肖伊佐"),
            new User(22,"贠晨曦"),
            new User(23,"李康宁"),
            new User(24,"马庆"),
            new User(25,"商婕"),
            new User(26,"余榕"),
            new User(27,"谌哲"),
            new User(28,"董翔锐"),
            new User(29,"陈泰宇"),
            new User(30,"赵允齐"),
            new User(31,"张柯"),
            new User(32,"廖文强"),
            new User(33,"刘轲"),
            new User(34,"廖浚斌"),
            new User(35,"凌凤仪")
    );

    @GetMapping("/userList")
    public List<User> getUserList(){
        return userList;
    }
}
