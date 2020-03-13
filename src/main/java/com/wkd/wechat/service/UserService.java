package com.wkd.wechat.service;

import com.wkd.wechat.dao.UserDao;
import com.wkd.wechat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User findUserById(String id){
        Optional<User> user=userDao.findById(id);
        return user.orElse(null);
    }
}
