package com.thoughtworks.capability.gtb.entrancequiz.domain;

public class User {
    Integer id;
    Integer groupId;
    String userName;

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
