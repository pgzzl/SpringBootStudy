package com.mark.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class User implements Serializable {
    private String id;
    private String nickname;
    private String phone;
    private String email;
    private String password;
    private String salt;
    private Timestamp gmtCreate;
    private Timestamp gmtUpdate;
    private List<SciNews> newsList;

    public User(String id, String nickname, String phone, String email, String password, String salt) {
        this.id = id;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.newsList = new ArrayList<SciNews>();
    }
}