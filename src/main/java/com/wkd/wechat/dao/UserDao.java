package com.wkd.wechat.dao;

import com.wkd.wechat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User,String> {

    Optional<User> findById(String id);

}
