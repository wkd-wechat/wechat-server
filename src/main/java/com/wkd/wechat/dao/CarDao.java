package com.wkd.wechat.dao;

import com.wkd.wechat.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Car,String> {

    List<Car> findAll();
}
